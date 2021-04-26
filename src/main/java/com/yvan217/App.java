package com.yvan217;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */

@SpringBootApplication
@MapperScan("com.yvan217.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
