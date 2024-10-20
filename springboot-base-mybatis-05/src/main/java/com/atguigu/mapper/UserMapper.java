package com.atguigu.mapper;

import com.atguigu.pojo.Customer;

import java.util.List;

public interface UserMapper {

    List<Customer> queryAll();

    int delete(int id);
}