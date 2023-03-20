package com.baomidou.mybatisplus.samples.reduce.springmvc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @author alan2lin
 * @see com.baomidou.mybatisplus.annotation.TableName
 * @see com.baomidou.mybatisplus.annotation.TableId
 */
@Data
@KeySequence("SEQ_USER")
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
