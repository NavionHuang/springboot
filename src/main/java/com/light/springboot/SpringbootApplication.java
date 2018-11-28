package com.light.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @SpringBootApplication注解指定项目为springboot，由此类当作程序入口 自动装配 web 依赖的环境 继承
 * @EnableCaching注解开启缓存 继承SpringBootServletInitializer 并重写 configure 方法用于打包war
 **/
@EnableCaching
@SpringBootApplication
@MapperScan("com.light.springboot.dao")//扫描dao接口
public class SpringbootApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	/**
	 * 用于打包war
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootApplication.class);
	}

}
