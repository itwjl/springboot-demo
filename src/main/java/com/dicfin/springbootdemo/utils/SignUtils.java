package com.dicfin.springbootdemo.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * JDK版本>=1.8
 * 依赖maven
 <dependency>
    <groupId>commons-collections</groupId>
    <artifactId>commons-collections</artifactId>
    <version>3.2.2</version>
</dependency>
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.8.2</version>  
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.8</version>
</dependency>
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.12</version>
</dependency>
 */
public class SignUtils {

	public static final String SIGN_HEADER_KEY = "X-POS-REQUEST-SIGN";
	public static final String ACCESS_KEY_HEADER_KEY = "X-POS-ACCESS-KEY";
	public static final String REQUEST_ID_HEADER_KEY = "X-POS-REQUEST-ID";
	public static final String REQUEST_TIME_HEADER_KEY = "X-POS-REQUEST-TIME";

	private static Logger logger = LoggerFactory.getLogger(SignUtils.class);

	public static void main(String[] args) {
		String key = "4cce3abb46c54c2cb6717b1d9639ad18";
		String sercret = "rizgY9jdLrhfD1N";
		String path = "/core/order/upload_order";

		Map<String, String> param = new HashMap<String, String>();
		param.put("test", "test");
		Map<String, String> headers = new HashMap<>();
		headers.put(ACCESS_KEY_HEADER_KEY, key);
		headers.put(REQUEST_TIME_HEADER_KEY, "2021-05-11 12:12:12");
		headers.put(REQUEST_ID_HEADER_KEY, UUID.randomUUID().toString());
		String sign = SignUtils.sign(key, sercret, path, param,
				headers);
		System.out.println("sign:" + sign);
	}

	/**
	 * 
	 * @param accessKey
	 * @param accessSercretKey
	 * @param path
	 *            请求路径
	 * @param param
	 *            参数对象
	 * @param header
	 *            请求header参数
	 * @return
	 */
	public static String sign(String accessKey, String accessSercretKey, String path, Object param,
			Map<String, String> headers) {
		JsonObject signParam = toJsonObject(param);
		signParam.addProperty("path", path);
		if (headers != null) {
			signParam.addProperty(REQUEST_ID_HEADER_KEY, headers.get(REQUEST_ID_HEADER_KEY));
			signParam.addProperty(REQUEST_TIME_HEADER_KEY, headers.get(REQUEST_TIME_HEADER_KEY));
		}
		signParam.addProperty(ACCESS_KEY_HEADER_KEY, accessKey);

		String original = getDataString(signParam);
		String sign = encrypt(accessSercretKey, original);
		return sign;
	}

	public static String encrypt(String secretKey, String message) {
		try {
			Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
			SecretKeySpec secret_key = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
			sha256_HMAC.init(secret_key);
			String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
			return hash;
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage(), e);
		} catch (InvalidKeyException e) {
			logger.error(e.getMessage(), e);
		}

		return null;
	}

	private static String getDataString(JsonObject data) {

		if (data == null || data.isJsonNull()) {
			return null;
		}

		Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);

			}
		});

		data.entrySet().forEach(item -> {
			JsonElement valueJsonElement = data.get(item.getKey());
			String value = null;
			if (valueJsonElement.isJsonArray()) {
				JsonElement jsonElement = sortParameter(valueJsonElement.getAsJsonArray());
				if (jsonElement != null && !jsonElement.isJsonNull()) {
					value = jsonElement.toString();
				}
			} else if (valueJsonElement.isJsonObject()) {
				JsonElement jsonElement = sortParameter(valueJsonElement.getAsJsonObject());
				if (jsonElement != null && !jsonElement.isJsonNull()) {
					value = jsonElement.toString();
				}
			} else if (!valueJsonElement.isJsonNull()) {
				value = valueJsonElement.getAsString();
			}
			if (StringUtils.isNotBlank(value)) {
				sortMap.put(item.getKey(), value);
			}
		});
		StringBuilder result = new StringBuilder();
		for (Map.Entry<String, String> entry : sortMap.entrySet()) {
			result.append(entry.getValue());
		}

		return result.toString();
	}

	private static JsonElement sortParameter(JsonObject data) {
		if (data == null || data.isJsonNull()) {
			return null;
		}

		Map<String, JsonElement> sortMap = new TreeMap<String, JsonElement>(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});

		data.entrySet().forEach(item -> {
			JsonElement valueJsonElement = data.get(item.getKey());
			JsonElement value = null;
			if (valueJsonElement.isJsonArray()) {
				value = sortParameter(valueJsonElement.getAsJsonArray());
			} else if (valueJsonElement.isJsonObject()) {
				value = sortParameter(valueJsonElement.getAsJsonObject());
			} else {
				value = valueJsonElement;
			}
			if (!valueJsonElement.isJsonNull()) {
				sortMap.put(item.getKey(), value);
			}
		});

		if (MapUtils.isNotEmpty(sortMap)) {
			Gson gson = new Gson();
			JsonElement jsonElement = gson.toJsonTree(sortMap);
			return jsonElement;
		}

		return data;
	}

	private static JsonElement sortParameter(JsonArray jsonArray) {
		if (jsonArray == null || jsonArray.isJsonNull()) {
			return null;
		}

		int arraySize = jsonArray.size();
		if (arraySize > 0) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JsonElement value = null;
				JsonElement valueJsonElement = jsonArray.get(i);
				if (valueJsonElement.isJsonArray()) {
					value = sortParameter(valueJsonElement.getAsJsonArray());
				} else if (valueJsonElement.isJsonObject()) {
					value = sortParameter(valueJsonElement.getAsJsonObject());
				} else {
					value = valueJsonElement;
				}
				if (!valueJsonElement.isJsonNull()) {
					jsonArray.set(i, value);
				}
			}
		}

		return jsonArray;
	}

	public static JsonObject toJsonObject(Object obj) {
		if (obj == null) {
			return null;
		}

		Gson gson = new Gson();
		JsonElement jsonElement = gson.toJsonTree(obj);
		JsonObject jsonObject = null;
		if (jsonElement.isJsonObject()) {
			jsonObject = jsonElement.getAsJsonObject();
		}

		return jsonObject;
	}
}