package com.baomidou.mybatisplus.samples.ar.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置
 *
 * @author miemie
 * @since 2018-08-10
 * @see org.mybatis.spring.annotation.MapperScan
 */
@Configuration
@MapperScan("com.baomidou.mybatisplus.samples.ar.mapper")
public class MybatisPlusConfig {
    //
}
