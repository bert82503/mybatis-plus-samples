package com.baomidou.samples.metainfo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * 填充器
 * <p></p>
 * 元对象字段填充控制器抽象类，实现公共字段自动写入
 *
 * @author nieqiurong 2018-08-10 22:59:23.
 * @see com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "operator", String.class, "Jetty");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "operator", String.class, "Tom");
    }
}
