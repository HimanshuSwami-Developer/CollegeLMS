package com.example.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;




@SpringBootApplication()
//@EnableWebSecurity
@ComponentScan(basePackages="com.example.college.controller,"+"com.example.college.service,"+"com.example.college")
public class CollegeLmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeLmsApplication.class, args);
	}

}
