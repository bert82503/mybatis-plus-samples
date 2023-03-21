package com.baomidou.mybatisplus.samples.typehandler.config;

import com.baomidou.mybatisplus.extension.handlers.GsonTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author miemie
 * @since 2019-11-28
 * @see org.springframework.boot.CommandLineRunner
 */
@Component
public class MpJsonConfig implements CommandLineRunner {

    /**
     * 可以set进去自己的
     */
    @Override
    public void run(String... args) throws Exception {
        // Jackson
        JacksonTypeHandler.setObjectMapper(new ObjectMapper());
        // Gson
        GsonTypeHandler.setGson(new Gson());
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
