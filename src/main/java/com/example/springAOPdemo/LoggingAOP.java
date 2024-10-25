package com.example.springAOPdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAOP {
	
	@Before("execution(* com.example.Services.*.*(..))")
	public void logBeforeMethod()
	{
		System.out.println("Logging done!!!");
	}

}
