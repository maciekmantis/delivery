package com.mks.delivery.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DBConfig.class)
@ComponentScan(basePackages = "com.mks.delivery")
public class AppConfig {

}
