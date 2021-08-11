package com.dicfin.springbootdemo.controller;

import com.dicfin.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Author Wang Jinglei
 * @Date 2021/8/11 15:50
 * @Version 2.0
 */
@RestController
public class DemoController {
    
    private final DemoService demoService;
    
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
    
    @GetMapping("test")
    public String demo(){
        return demoService.fun();
    }
}
