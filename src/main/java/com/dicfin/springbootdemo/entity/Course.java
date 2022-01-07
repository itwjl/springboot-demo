package com.dicfin.springbootdemo.entity;

import lombok.Data;

@Data
public class Course {
    private Long id;
    private String cname;
    private Long userId;
    private String cstatus;
}
