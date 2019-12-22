package com.xhiot.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * Create by Liuyq on 2019/12/17 8:59
 **/
@Configuration
@MapperScan({"com.xhiot.mall.mallmbg.mapper","com.xhiot.search.dao"})
public class MyBatisConfig {
}
