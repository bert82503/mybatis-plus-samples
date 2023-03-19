package com.baomidou.mybatisplus.samples.optlocker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @date 2018/8/24
 * @see com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
 * @see com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor
 */
@Configuration
public class MybatisPlusOptLockerConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 乐观锁
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor(true));
        return interceptor;
    }
}
