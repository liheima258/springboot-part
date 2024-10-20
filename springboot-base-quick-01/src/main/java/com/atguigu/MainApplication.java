package com.atguigu;

/**
 * 功能：学习springboot ==> 入门
 * 日期：2024/8/711:32
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication是一个特殊的注解，用于标识一个Spring Boot应用程序的入口类。它的主要作用是将三个常用注解组合在一起，简化了配置的过程。
 *
 * 具体而言，@SpringBootApplication注解包含以下三个注解的功能：
 *     @Configuration：将该类标识为应用程序的配置类。
 *     @EnableAutoConfiguration：自动加载其他配置类
 *     @ComponentScan：自动扫描并加载应用程序中的组件，它默认扫描@SpringBootApplication注解所在类的包及其子包中的组件。
 *
 * 使用@SpringBootApplication注解，可以将上述三个注解的功能集中在一个注解上，简化了配置文件的编写和组件的加载和扫描过程。
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1.创建ioc容器，加载配置  2.启动内置的web服务器
        SpringApplication.run(MainApplication.class,args);
    }
}