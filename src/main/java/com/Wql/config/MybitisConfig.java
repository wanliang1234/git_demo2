package com.Wql.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybitisConfig
{
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource)
    {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.Wql.domain");
        return sqlSessionFactoryBean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.Wql.dao");
        return mapperScannerConfigurer;
    }
}
