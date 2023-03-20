package com.baomidou.mybatisplus.samples.tenant;

import com.baomidou.mybatisplus.samples.tenant.entity.User;
import com.baomidou.mybatisplus.samples.tenant.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 多租户 Tenant 演示
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 */
@SpringBootTest
public class TenantTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void aInsert() {
        User user = new User();
        user.setName("一一");
        Assertions.assertTrue(userMapper.insert(user) > 0);
        user = userMapper.selectById(user.getId());
        Assertions.assertEquals((long) user.getTenantId(), 1);
    }


    @Test
    public void bDelete() {
        Assertions.assertTrue(userMapper.deleteById(3L) > 0);
    }


    @Test
    public void cUpdate() {
        Assertions.assertTrue(userMapper.updateById(new User().setId(1L).setName("mp")) > 0);
    }

    @Test
    public void dSelect() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(u -> Assertions.assertEquals((long) u.getTenantId(), 1));
    }

    /**
     * 自定义SQL：默认也会增加多租户条件
     * 参考打印的SQL
     */
    @Test
    public void manualSqlTenantFilterTest() {
        System.out.println(userMapper.myCount());
    }

    @Test
    public void testTenantFilter(){
        userMapper.getAddrAndUser(null).forEach(System.out::println);
        userMapper.getAddrAndUser("add").forEach(System.out::println);
        userMapper.getUserAndAddr(null).forEach(System.out::println);
        userMapper.getUserAndAddr("J").forEach(System.out::println);
    }
}
