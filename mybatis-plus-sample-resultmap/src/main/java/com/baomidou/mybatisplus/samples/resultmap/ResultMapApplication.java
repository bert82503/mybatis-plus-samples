package com.baomidou.mybatisplus.samples.resultmap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miemie
 * @since 2019-11-27
 */
@MapperScan("com.baomidou.mybatisplus.samples.resultmap.mapper")
@SpringBootApplication
public class ResultMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResultMapApplication.class, args);
    }
}
