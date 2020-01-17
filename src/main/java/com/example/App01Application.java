package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.example.demo.entity")
@SpringBootApplication
public class App01Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(App01Application.class, args);
	}

	// 为springboot打包项目用的
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(this.getClass());
	}

}
