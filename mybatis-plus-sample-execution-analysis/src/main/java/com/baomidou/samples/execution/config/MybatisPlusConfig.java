package com.baomidou.samples.execution.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置文件
 *
 * @author nieqiurong 2018/8/11 21:10
 * @see com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 攻击 SQL 阻断解析器，防止全表更新与删除
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        return interceptor;
    }
}
