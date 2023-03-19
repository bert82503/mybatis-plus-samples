package com.baomidou.mybatisplus.samples.optlocker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.*.mapper")
public class OptLockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptLockerApplication.class, args);
    }
}
