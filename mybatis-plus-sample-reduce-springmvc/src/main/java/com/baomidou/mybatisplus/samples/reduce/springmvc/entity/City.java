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
@KeySequence("SEQ_CITY")
@TableName("city")
public class City {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String name;
    private String province;
}
