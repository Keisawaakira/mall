package com.train.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.train.mall.mbg.mapper")
public class MyBatisConfig {
}
