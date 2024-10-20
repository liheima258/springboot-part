package com.atguigu.controller;

import com.atguigu.pojo.Customer;
import com.atguigu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<Customer> getUser(){
        List<Customer> userList = userService.queryAll();
        log.info("查询的user数据为:{}",userList);
        return userList;
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void delete(){
        userService.delete(1);
    }

}