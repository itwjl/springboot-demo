package com.dicfin.springbootdemo.controller;

import com.dicfin.springbootdemo.mq.KafkaSender;
import com.dicfin.springbootdemo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    
    public DemoController(DemoService demoService, KafkaSender kafkaSender) {
        this.demoService = demoService;
        this.kafkaSender = kafkaSender;
    }
    
    @GetMapping("test")
    public String demo(){
        return demoService.fun();
    }
    
    @GetMapping("sendMessage/{msg}")
    public void sendMessage(@PathVariable("msg") String msg){
        kafkaSender.send(msg);
    }
}
