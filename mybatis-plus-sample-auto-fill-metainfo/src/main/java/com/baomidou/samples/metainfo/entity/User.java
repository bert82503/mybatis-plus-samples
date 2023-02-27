package com.baomidou.samples.metainfo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 * @author nieqiurong 2018-08-10 22:55:21.
 * @see com.baomidou.mybatisplus.annotation.TableField
 */
@TableName(value = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private Long id;
    
    private String name;
    
    private Integer age;
    
    private String email;

    /**
     * 字段填充策略
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String operator;
}
