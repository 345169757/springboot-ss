package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by Administrator on 2018/10/17.
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")//指定dao层的位置
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
//ssssssssssssssss
    }
}
