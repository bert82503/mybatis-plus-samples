package com.baomidou.mybatisplus.samples.association.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author hubin
 * @see com.baomidou.mybatisplus.annotation.TableName
 */
@Data
@TableName("company")
public class Company {
	private Long id;
    private String name;
    List<User> userList;
}
