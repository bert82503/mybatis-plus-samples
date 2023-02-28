package com.baomidou.mybatisplus.samples.deluxe.entity;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;

import com.baomidou.mybatisplus.samples.deluxe.config.TestTypeHandler;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户表
 * 设置逻辑删除字段，并且逻辑删除字段不 select 出来
 *
 * @author miemie
 * @since 2018-08-12
 * @see com.baomidou.mybatisplus.annotation.TableLogic
 * @see com.baomidou.mybatisplus.annotation.TableField
 * @see com.baomidou.mybatisplus.annotation.Version
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    /**
     * 自定义类型处理器
     */
    @TableField(typeHandler = TestTypeHandler.class)
    private String email;

    @Version
    private Integer version;

    /**
     * 表字段逻辑处理（逻辑删除）
     * 是否进行 select 查询
     */
    @TableLogic(value = "0", delval = "1")
    @TableField(select = false)
    private Integer deleted;

    /**
     * 字段自动填充策略
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Timestamp createTime;
}
