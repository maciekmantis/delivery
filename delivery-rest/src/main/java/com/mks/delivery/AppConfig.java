package com.mks.delivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.mks.delivery.rest")
//@PropertySource( {"classpath:rest.properties", "classpath:web.properties"})
@Import(com.mks.delivery.config.AppConfig.class)
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
