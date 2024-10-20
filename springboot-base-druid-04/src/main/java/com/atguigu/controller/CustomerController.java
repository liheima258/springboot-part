package com.atguigu.controller;

import com.atguigu.pojo.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/get")
    @ResponseBody
    public Customer getUser(){
        String sql = "select * from t_customer ; ";
        Customer customer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class));
        log.info("查询的user数据为:{}",customer.toString());
        return customer;
    }
    
}