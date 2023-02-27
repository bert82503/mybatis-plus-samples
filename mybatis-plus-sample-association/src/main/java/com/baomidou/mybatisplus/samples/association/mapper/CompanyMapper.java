package com.baomidou.mybatisplus.samples.association.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.association.entity.Company;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hubin
 * @see com.baomidou.mybatisplus.core.mapper.BaseMapper
 */
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

    Company testResultMapCollection();
}
