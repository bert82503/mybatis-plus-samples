package com.baomidou.mybatisplus.samples.deluxe.methods;

import org.apache.ibatis.executor.keygen.NoKeyGenerator;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @date 2019/6/14
 * @see com.baomidou.mybatisplus.core.injector.AbstractMethod
 * @see org.apache.ibatis.mapping.MappedStatement
 * @see org.apache.ibatis.mapping.SqlSource
 */
public class MyInsertAll extends AbstractMethod {

    private static final long serialVersionUID = -9141003726687460321L;

    public MyInsertAll() {
        this("myInsertAll");
    }

    public MyInsertAll(String methodName) {
        super(methodName);
    }

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        String sql = "insert into %s %s values %s";
        StringBuilder fieldSql = new StringBuilder();
        // 表主键ID 字段
        fieldSql.append(tableInfo.getKeyColumn()).append(",");
        StringBuilder valueSql = new StringBuilder();
        valueSql.append("#{").append(tableInfo.getKeyProperty()).append("},");
        // 表字段信息列表
        tableInfo.getFieldList().forEach(fieldInfo -> {
            fieldSql.append(fieldInfo.getColumn()).append(",");
            valueSql.append("#{").append(fieldInfo.getProperty()).append("},");
        });
        // 截取
        fieldSql.delete(fieldSql.length() - 1, fieldSql.length());
        fieldSql.insert(0, "(");
        fieldSql.append(")");
        valueSql.insert(0, "(");
        valueSql.delete(valueSql.length() - 1, valueSql.length());
        valueSql.append(")");
        String sqlResult = String.format(sql, tableInfo.getTableName(), fieldSql.toString(), valueSql.toString());
        // SQL源
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sqlResult, modelClass);
        return this.addInsertMappedStatement(mapperClass, modelClass, sqlSource,
                new NoKeyGenerator(), null, null);
    }
}
