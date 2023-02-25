package com.baomidou.mybatisplus.samples.assembly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.assembly.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nieqiuqiu
 * @see org.apache.ibatis.annotations.Mapper
 * @see com.baomidou.mybatisplus.core.mapper.BaseMapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    //
}
