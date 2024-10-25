package com.example.springAOPdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.Services.serviceLogic;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.Services"})
@ComponentScan("com")
public class SpringAopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
		
		serviceLogic obj=context.getBean(serviceLogic.class);
		System.out.println(obj.logging());
		System.out.println(obj.loggingOne());
		
	}

}
