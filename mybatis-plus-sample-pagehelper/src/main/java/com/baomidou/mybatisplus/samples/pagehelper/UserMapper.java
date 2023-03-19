package com.baomidou.mybatisplus.samples.pagehelper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author miemie
 * @since 2020-05-29
 * @see com.baomidou.mybatisplus.core.mapper.BaseMapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    //
}
