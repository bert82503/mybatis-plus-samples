package com.baomidou.mybatisplus.samples.association.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.samples.association.entity.User;

import java.util.List;

/**
 * @author hubin
 * @see com.baomidou.mybatisplus.extension.service.IService
 * @see com.baomidou.mybatisplus.core.metadata.IPage
 * @see com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
 */
public interface IUserService extends IService<User> {

    List<User> selectUserPage(IPage<User> page, QueryWrapper<User> wrapper);
}
