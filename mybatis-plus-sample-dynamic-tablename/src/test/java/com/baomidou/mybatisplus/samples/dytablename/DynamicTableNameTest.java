package com.baomidou.mybatisplus.samples.dytablename;

import com.baomidou.mybatisplus.samples.dytablename.config.RequestDataHelper;
import com.baomidou.mybatisplus.samples.dytablename.entity.User;
import com.baomidou.mybatisplus.samples.dytablename.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <p>
 * 内置 动态表名 演示
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 */
@SpringBootTest
class DynamicTableNameTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void test() {
        RequestDataHelper.setRequestData(new HashMap<String, Object>() {
            private static final long serialVersionUID = 8904848291446590324L;

            {
            put("id", 123);
            put("hello", "tomcat");
            put("name", "汤姆凯特");
        }});
        // 自己去观察打印 SQL 目前随机访问 user_2018  user_2019 表
        for (int i = 0; i < 6; i++) {
            User user = userMapper.selectById(1);
            System.err.println(user.getName());
        }
    }
}
