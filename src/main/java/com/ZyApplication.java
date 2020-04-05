package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.dao")
@SpringBootApplication
public class ZyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZyApplication.class, args);
	}

}
