package com.baomidou.samples;

import com.baomidou.samples.entity.User;
import com.baomidou.samples.mapper.UserMapper;
import com.baomidou.samples.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class IdStringTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setName("靓仔");
        user.setAge(18);
        userMapper.insert(user);
        Assertions.assertEquals("1", user.getId());

        testBatch();
    }

    /**
     * 批量插入
     */
    public void testBatch() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setId(i + "1");
            user.setName("靓仔" + i);
            user.setAge(18 + i);
            users.add(user);
        }
        boolean result = userService.saveBatch(users);
        Assertions.assertTrue(result);
    }
}
