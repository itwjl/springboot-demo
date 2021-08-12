package com.dicfin.springbootdemo;

import com.dicfin.springbootdemo.entity.Message;
import com.dicfin.springbootdemo.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootDemoApplicationTests {
    
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    @Autowired
    private RedisUtils redisUtils;
    
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("test", "踩踩踩踩踩踩踩踩踩踩踩踩");
        //        redisTemplate.opsForHash().put("", );
        System.out.println("添加成功");
        
    }
    
    @Test
    void printRedisVal() {
        System.out.println(redisTemplate.opsForValue().get("test"));
    }
    
    
    @Test
    void redisHashTest() {
        Message message = new Message();
        message.setId("1234L");
        message.setSendTime(new Date());
        message.setMsg("hahahah");
        HashOperations<String, String, String> map = redisTemplate.opsForHash();
        map.put(message.getId(), "name", message.getMsg());
        map.put(message.getId(), "gender", message.getSendTime().toString());
        redisTemplate.expire(message.getId(), 100, TimeUnit.SECONDS);
    }
    
    @Test
    void redisHashTest2() {
        
        //        Map<String, Object> map = new HashMap<>();
        //        map.put("111","112111");
        //        map.put("222","222222");
        //        map.put("333","333333");
        //        map.put("444","444444");
        //        redisUtils.hmset("aaaa:maap", map);
        redisTemplate.opsForValue().set("11", 1);
    }
    
    @Test
    void redisHashTest3() {
        
        //        Map<String, Object> map = new HashMap<>();
        //        map.put("111","112111");
        //        map.put("222","222222");
        //        map.put("333","333333");
        //        map.put("444","444444");
        //        redisUtils.hmset("aaaa:maap", map);
        
        //        Object o = redisTemplate.opsForValue().get("1");
        //        System.out.println(o.getClass().toString());
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
//        redisTemplate.opsForList().rightPush("aa11", "1");
//        redisTemplate.opsForList().rightPush("aa11", "2");
//        redisTemplate.opsForList().rightPush("aa11", "3");
//        redisTemplate.opsForList().rightPush("aa11", "4");
    
        Object aa11 = redisTemplate.opsForList().range("aa11", 0, -1);
    
        System.out.println(aa11);
    }
    
   
    
}
