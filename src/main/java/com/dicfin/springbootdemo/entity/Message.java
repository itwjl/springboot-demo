package com.dicfin.springbootdemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author johnny
 * @create 2020-09-23 上午9:21
 **/
@Data
public class Message {


    private String id;

    private String msg;

    private Date sendTime;
}