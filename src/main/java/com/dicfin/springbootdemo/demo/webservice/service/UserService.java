package com.dicfin.springbootdemo.demo.webservice.service;

import com.dicfin.springbootdemo.demo.webservice.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * 接口描述:
 *
 * @author Wang Jinglei
 * @date 2021/11/2 7:35 下午
 * @modifier Wang Jinglei
 * @date 2021/11/2 7:35 下午
 * @Version V1.0
 */
@WebService(targetNamespace = "wsdl.oven.com", name = "userPortType")
public interface UserService {

    /**
     * 获取字符串
     * @param msg
     * @return
     */
    @WebMethod
    String getString(@WebParam(name = "msg") String msg);

    /**
     * 根据姓名获取用户
     * @param name
     * @return
     */
    @WebMethod
    User getUserByName(@WebParam(name = "name") String name);

    /**
     * 获取兴趣列表
     * @return
     */
    @WebMethod
    List<User> getList();

}
