package com.interpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.interpro.dao"})
public class InterproApplication {

    public static void main(String[] args) {

        SpringApplication.run(InterproApplication.class, args);
    }
}
