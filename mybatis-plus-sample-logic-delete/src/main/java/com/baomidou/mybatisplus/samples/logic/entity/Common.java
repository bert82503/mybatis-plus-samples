package com.baomidou.mybatisplus.samples.logic.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xiaoguogai
 * @since 2019-11-26
 * @see com.baomidou.mybatisplus.annotation.TableLogic
 */
@Data
@Accessors(chain = true)
public class Common {

    private Long id;

    private String name;

    /**
     * 表字段逻辑处理注解（逻辑删除）
     */
    @TableLogic
    private Integer deleted;
}
