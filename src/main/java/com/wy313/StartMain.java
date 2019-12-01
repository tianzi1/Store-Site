package com.wy313;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.wy313.mapping")
//@EnableWebMvc
public class StartMain {
    public static void main(String[] args) {
        SpringApplication.run(StartMain.class,args);
    }
}
