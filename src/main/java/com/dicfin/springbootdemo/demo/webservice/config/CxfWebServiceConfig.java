package com.dicfin.springbootdemo.demo.webservice.config;

import com.dicfin.springbootdemo.demo.webservice.service.UserService;
import com.dicfin.springbootdemo.demo.webservice.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * 类描述:
 *
 * @author Wang Jinglei
 * @date 2021/11/2 7:54 下午
 * @modifier Wang Jinglei
 * @date 2021/11/2 7:54 下午
 * @Version V1.0
 */
@Configuration
public class CxfWebServiceConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(UserService userService) {
        Endpoint endpoint = new EndpointImpl(springBus(), userService);
        endpoint.publish("/user");
        return endpoint;
    }
}
