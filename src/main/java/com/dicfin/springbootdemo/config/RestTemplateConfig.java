package com.dicfin.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

/**
 * @ClassName RestTemplateConfig
 * @Author Wang Jinglei
 * @Date 2021/9/17 15:47
 * @Version 2.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        
        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
        restTemplate.setRequestFactory(new HttpComponentsClientRestfulHttpRequestFactory());
        return restTemplate;
    }
    
    // 设置超时时间
    private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        // Connect timeout 3s
        clientHttpRequestFactory.setConnectTimeout(60000);
        // Read timeout 3s
        clientHttpRequestFactory.setReadTimeout(60000);
        return clientHttpRequestFactory;
    }
}
