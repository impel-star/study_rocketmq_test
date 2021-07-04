package com.example.study_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.dao")
@SpringBootApplication
public class StudyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyDemoApplication.class, args);
	}

}
