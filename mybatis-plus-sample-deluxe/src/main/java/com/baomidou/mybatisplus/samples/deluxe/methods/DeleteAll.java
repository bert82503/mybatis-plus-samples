package com.baomidou.mybatisplus.samples.deluxe.methods;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

/**
 * 删除全部
 *
 * @author nieqiurong 2018/8/11 20:29.
 * @see com.baomidou.mybatisplus.core.injector.AbstractMethod
 * @see org.apache.ibatis.mapping.MappedStatement
 * @see org.apache.ibatis.mapping.SqlSource
 */
public class DeleteAll extends AbstractMethod {

    private static final long serialVersionUID = 5532144364709881311L;

    public DeleteAll() {
        this("deleteAll");
    }

    public DeleteAll(String methodName) {
        super(methodName);
    }

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        /* 执行 SQL ，动态 SQL 参考类 SqlMethod */
        String sql = "delete from " + tableInfo.getTableName();
        /* mapper 接口方法名一致 */
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        return this.addDeleteMappedStatement(mapperClass, sqlSource);
    }
}
