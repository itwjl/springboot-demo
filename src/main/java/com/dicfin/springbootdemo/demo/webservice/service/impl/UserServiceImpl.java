package com.dicfin.springbootdemo.demo.webservice.service.impl;

import com.dicfin.springbootdemo.demo.webservice.entity.User;
import com.dicfin.springbootdemo.demo.webservice.service.UserService;
import com.dicfin.springbootdemo.demo.webservice.vo.Gender;

import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

/**
 * 类描述:
 *
 * @author Wang Jinglei
 * @date 2021/11/2 7:40 下午
 * @modifier Wang Jinglei
 * @date 2021/11/2 7:40 下午
 * @Version V1.0
 */
@WebService(
        targetNamespace = "wsdl.oven.com",           // wsdl命名空间
        name = "userPortType",          // portType名称，客户端生成代码时，为接口名称
        serviceName = "userService",    // 服务name名称
        portName = "userPortName",      // port名称
        endpointInterface = "com.oven.service.UserService" // 指定发布webservice的接口类，此类也需要接入@WebService注解
)
public class UserServiceImpl implements UserService {

    @Override
    public String getString(String msg) {

        return "";
    }

    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(18);
        user.setGender(Gender.MALE);
        user.setHobby(Arrays.asList("吃货", "睡觉"));
        return user;
    }

    @Override
    public List<User> getList() {

        User user1 = new User("Oven", Gender.MALE, 18, Arrays.asList("吃饭", "睡觉", "打豆豆"));
        User user2 = new User("Oven", Gender.MALE, 18, Arrays.asList("吃饭", "睡觉", "打豆豆"));

        return Arrays.asList(user1, user2);
    }
}
