package com.baomidou.mybatisplus.samples.reduce.springmvc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.reduce.springmvc.entity.User;

/**
 * @see com.baomidou.mybatisplus.core.mapper.BaseMapper
 */
public interface UserMapper extends BaseMapper<User> {

    Integer selectMaxAge();

}
