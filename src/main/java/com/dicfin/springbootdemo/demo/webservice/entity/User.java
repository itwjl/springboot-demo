package com.dicfin.springbootdemo.demo.webservice.entity;

import com.dicfin.springbootdemo.demo.webservice.vo.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 类描述:
 *
 * @author Wang Jinglei
 * @date 2021/11/2 7:33 下午
 * @modifier Wang Jinglei
 * @date 2021/11/2 7:33 下午
 * @Version V1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Gender gender;
    private int age;
    private List<String> hobby;
}
