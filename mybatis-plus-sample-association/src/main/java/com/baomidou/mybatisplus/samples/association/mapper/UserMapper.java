package com.baomidou.mybatisplus.samples.association.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.samples.association.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hubin
 * @see com.baomidou.mybatisplus.core.metadata.IPage
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 分页查询用户列表
     *
     * @param page 分页参数
     * @param wrapper 查询条件
     * @return 用户列表
     */
    List<User> selectUserPage(IPage<User> page, @Param("ew") QueryWrapper<User> wrapper);
}
