package com.xhiot.malladmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.xhiot.mall.mallmbg.mapper","com.xhiot.malladmin.dao"})
@SpringBootApplication
public class MallAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }

}
