package com.baomidou.samples.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author nieqiuqiu 2019/11/30
 * @see com.baomidou.mybatisplus.annotation.TableId
 */
@Data
public class User {
    /**
     * 表的主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
