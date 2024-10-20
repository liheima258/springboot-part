package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能：学习springboot ==> 整合mybatis+事务tx和切面aop的使用
 * 整合mybatis：导入依赖，在yml文件中编写 mybatis 相关配置（代替mybatis-config文件），在启动类上加 @MapperScan（扫描mapper接口）
 * 事务的使用：导入 spring-boot-starter-jdbc 依赖，直接在方法上用 @Transactional 即可
 * aop的使用：导入 spring-boot-starter-aop 依赖，直接写advice类即可生效
 * 日期：2024/8/716:57
 */
@MapperScan("com.atguigu.mapper") //mapper接口扫描配置
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
