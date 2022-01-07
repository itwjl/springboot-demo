package com.dicfin.springbootdemo.demo.http;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 类描述:
 *
 * @author Wang Jinglei
 * @date 2021/12/5 6:33 下午
 * @modifier Wang Jinglei
 * @date 2021/12/5 6:33 下午
 * @Version V1.0
 */
public class WuuXiangPostDemo {
    public static void main(String[] args) throws IOException {
        // 公钥
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDBgqqTw4oBp4EKI35K6VSUMqCogsropY1voAkHrBf6AZl4kb2TdG2TfKhTzBsPBtp/3wrTAlUHO6g1qHr/FaUVQc3U1gkf/XdWWcXr+2UEfq6OJt0KdNXcBGSA1zY7Q6ndWTOGjMtSdvbkC0VoFP4T6+AZRHwehpK52rr+aEVKNQIDAQAB";
        // 调用方id
        Integer productId = 1000001056;
        // 版本号
        String version = "1.0.0";
        // 业务参数json并加密
        JSONObject obj = new JSONObject();
        obj.put("companyId", 1000001056);
        obj.put("exchangeCode", "112312312312");
        obj.put("discernType", 4);
        obj.put("discernValue", "135xxxx3033");
        String sign = ""; // RSAUtils.encryptByPublicKey(obj.toJSONString(), publicKey);
        // 接口入参
        JSONObject params = new JSONObject();
        params.put("productId", productId);
        params.put("version", version);
        params.put("sign", sign);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;
        BufferedReader reader = null;
        StringBuffer response = new StringBuffer();
        try {
            // 接口url
            String url = "https://cscrm7.wuuxiang.com/crm7api/api/coupon/exchange.do";
            HttpPost httpPost = new HttpPost(url);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(6000).setConnectTimeout(6000).build();
            httpPost.setConfig(requestConfig);
            httpPost.addHeader("Content-Type", "application/json");
            ByteArrayEntity entity = new ByteArrayEntity(params.toJSONString().getBytes());
            httpPost.setEntity(entity);
            // 发起post请求
            httpResponse = httpClient.execute(httpPost);
            reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
        }catch (Exception var){
            var.printStackTrace();
        }finally {
            if(reader != null){
                reader.close();
            }
            if(httpResponse != null){
                httpResponse.close();
            }
            httpClient.close();
        }
        System.out.println(response.toString());

    }
}
