package com.dicfin.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootDemoApplicationTests {
    
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("test", "ceshi");
        System.out.println("qqq");
        System.out.println(redisTemplate.opsForValue().get("test"));
    }

}
