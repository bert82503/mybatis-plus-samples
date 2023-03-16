package com.baomidou.mybatisplus.samples.deluxe;

import java.util.List;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.samples.deluxe.methods.DeleteAll;
import com.baomidou.mybatisplus.samples.deluxe.methods.MyInsertAll;
import com.baomidou.mybatisplus.samples.deluxe.methods.MysqlInsertAllBatch;

/**
 * 自定义 SqlInjector
 *
 * @author miemie
 * @since 2018-08-13
 * @see com.baomidou.mybatisplus.core.injector.DefaultSqlInjector 
 */
public class MyLogicSqlInjector extends DefaultSqlInjector {

    /**
     * 如果只需增加方法，保留MP自带方法
     * 可以super.getMethodList() 再add
     */
    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass, TableInfo tableInfo) {
        // Mapper方法列表
        List<AbstractMethod> methodList = super.getMethodList(mapperClass, tableInfo);
        methodList.add(new DeleteAll());
        methodList.add(new MyInsertAll());
        methodList.add(new MysqlInsertAllBatch());
        methodList.add(new SelectById());
        return methodList;
    }
}
