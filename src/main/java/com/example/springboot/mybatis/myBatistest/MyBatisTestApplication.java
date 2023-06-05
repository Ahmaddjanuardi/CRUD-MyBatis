package com.example.springboot.mybatis.myBatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.example.springboot.mybatis.myBatistest.dao")
@SpringBootApplication
public class MyBatisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisTestApplication.class, args);
	}

}
