package com.baomidou.mybatisplus.samples.association.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hubin
 * @see com.baomidou.mybatisplus.annotation.TableName
 * @see com.baomidou.mybatisplus.annotation.TableId
 * @see com.baomidou.mybatisplus.annotation.TableField
 */
@Setter
@Getter
@ToString
@TableName("user")
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @TableField(value = "company_id", property = "company.id")
    private Company company;
    private String name;
    private Integer age;
    private String email;
}
