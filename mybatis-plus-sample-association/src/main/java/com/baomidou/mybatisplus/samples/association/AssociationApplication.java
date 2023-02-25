package com.baomidou.mybatisplus.samples.association;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动入口
 *
 * @author hubin
 * @see org.mybatis.spring.annotation.MapperScan
 */
@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.*.mapper")
public class AssociationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssociationApplication.class, args);
    }

}
