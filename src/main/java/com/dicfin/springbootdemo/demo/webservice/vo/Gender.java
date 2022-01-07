package com.dicfin.springbootdemo.demo.webservice.vo;

/**
 * 性别枚举
 * @author 王敬磊
 */
public enum Gender {

    MALE("男"),
    FEMALE("女");

    String value;

    Gender(String value) {
        this.value = value;
    }
}
