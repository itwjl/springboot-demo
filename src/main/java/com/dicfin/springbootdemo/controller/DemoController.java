package com.dicfin.springbootdemo.controller;

import com.dicfin.springbootdemo.mq.KafkaSender;
import com.dicfin.springbootdemo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName DemoController
 * @Author Wang Jinglei
 * @Date 2021/8/11 15:50
 * @Version 2.0
 */
@Slf4j
@RestController
public class DemoController {
    
    private final KafkaSender kafkaSender;
    
    private final DemoService demoService;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public DemoController(DemoService demoService, KafkaSender kafkaSender) {
        this.demoService = demoService;
        this.kafkaSender = kafkaSender;
    }
    
    @GetMapping("test")
    public String demo(@RequestBody Map<String, String[]> param){
        System.out.println("param = " + param);
        return demoService.fun();
    }
    
    @GetMapping("sendMessage/{msg}")
    public void sendMessage(@PathVariable("msg") String msg){
        kafkaSender.send(msg);
    }
    
    @GetMapping("getForEntity")
    public void getForEntity(){
//        String[] value = {"hello", "get"};
//        HashMap<String, String[]> map = new HashMap<>();
//        map.put("param", value);
//        ResponseEntity<Map> responseEntity = restTemplate.getForEntity("http://localhost:8084/test", Map.class, map);
        String url = "http://localhost:8084/test";
        HttpHeaders httpHeaders = new HttpHeaders();
    
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    
        String body = "{\"provinceCode\": [\"12\",\"reference1\", \"13\",\"requestId\", \"13\"]}";
    
        HttpEntity requestEntity = new HttpEntity(body, httpHeaders);
    
        ResponseEntity response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
    
        String result = String.valueOf(response.getBody());
        
        System.out.println(response);
    }
}
