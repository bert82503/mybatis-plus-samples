package com.baomidou.mybatisplus.samples.ar;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.samples.ar.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>
 * Active Record 演示
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 * @see com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
 * @see com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper
 */
@SpringBootTest
public class ActiveRecordTest {

    @Test
    public void aInsert() {
        User user = new User();
        user.setName("咩咩");
        user.setAge(5);
        user.setEmail("miemie@mp.com");
        // 插入
        Assertions.assertTrue(user.insert());
        // 成功可以直接获取 ID
        System.out.println("\n插入成功 ID 为：" + user.getId());
    }


    @Test
    public void bDelete() {
        // 删除
        Assertions.assertTrue(new User().setId(3L).deleteById());
        // 查询条件
        Assertions.assertTrue(new User().delete(new QueryWrapper<User>().lambda()
                .eq(User::getName, "Sandy")));
    }


    @Test
    public void cUpdate() {
        Assertions.assertTrue(new User().setId(1L).setEmail("ab@c.c").updateById());
        // 更新条件和语句
        Assertions.assertTrue(new User().update(new UpdateWrapper<User>().lambda()
                        .set(User::getAge, 3).eq(User::getId, 2)));
    }


    @Test
    public void dSelect() {
        Assertions.assertEquals("ab@c.c", new User().setId(1L).selectById().getEmail());
        // 查询条件
        User user = new User().selectOne(new QueryWrapper<User>().lambda()
                .eq(User::getId, 2));
        Assertions.assertEquals("Jack", user.getName());
        Assertions.assertEquals(user.getAge(), 3);
    }
}
