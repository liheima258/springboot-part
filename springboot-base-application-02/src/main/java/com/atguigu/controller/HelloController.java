package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private User user;


    /**
     *  可以使用 @value 来读取 .properties 或者 .yml 中的配置
     *  缺点：只能读取单个值，不能读取集合值
     */
    @Value("${lzx.username}")
    private String username;
    @Value("${lzx.password}")
    private String password;

    @GetMapping("/properties")
    public String properties(){
        return username+password;
    }

    @GetMapping("yml")
    public User yml(){
        return user;
    }

}