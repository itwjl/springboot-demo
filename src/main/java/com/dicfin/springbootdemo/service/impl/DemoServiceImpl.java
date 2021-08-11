package com.dicfin.springbootdemo.service.impl;

import com.dicfin.springbootdemo.service.DemoService;
import com.dicfin.springbootdemo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoServiceImpl
 * @Author Wang Jinglei
 * @Date 2021/8/11 15:48
 * @Version 2.0
 */
@Service
public class DemoServiceImpl implements DemoService {
    
    private final RedisUtils redisUtils;
    
    public DemoServiceImpl(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
    }
    
    @Override
    public String fun() {
    
        redisUtils.set("test", "测试1", 40);
        return redisUtils.get("test").toString();
    }
}
