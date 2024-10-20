package com.atguigu.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
/*
    在类上通过@ConfigurationProperties注解声明该类要读取属性配置
    prefix="test" 读取属性文件中前缀为test的值。前缀和属性名称和配置文件中的key必须要保持一致才可以注入成功
 */
@ConfigurationProperties(prefix = "test")
public class User {

    //这里的属性名与test下的key要一致，无需再写@value注解，即可完成自动赋值
    private String username;
    private String password;
    private List<String> list;
}
