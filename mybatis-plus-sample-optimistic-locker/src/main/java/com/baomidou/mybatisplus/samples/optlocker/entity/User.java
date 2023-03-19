package com.baomidou.mybatisplus.samples.optlocker.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;

import lombok.Data;

/**
 * @author yuxiaobin
 * @see com.baomidou.mybatisplus.annotation.TableId
 * @see com.baomidou.mybatisplus.annotation.Version
 */
@Data
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    /**
     * 乐观锁注解
     */
    @Version
    private Integer version;
}
