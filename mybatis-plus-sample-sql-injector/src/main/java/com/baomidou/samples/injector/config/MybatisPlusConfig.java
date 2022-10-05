package com.baomidou.samples.injector.config;

import com.baomidou.samples.injector.base.MySqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author K
 * @since 2019/7/9
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public MySqlInjector sqlInjector() {
        // sql注入器
        // 自定义Sql注入
        return new MySqlInjector();
    }
}
