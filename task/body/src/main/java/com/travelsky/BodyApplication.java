package com.travelsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.travelsky.mapper")
public class BodyApplication {
    public static void main(String[] args){
        SpringApplication.run(BodyApplication.class,args);
    }
}
