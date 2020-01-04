package com.madan.springboot.sampleapplication.sampleapp;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		for(String context : applicationContext.getBeanDefinitionNames()) {
			System.out.println(context);
		}
	}

}
