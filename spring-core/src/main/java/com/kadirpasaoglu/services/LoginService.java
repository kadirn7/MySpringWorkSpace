package com.kadirpasaoglu.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kadirpasaoglu.config.AppConfig;

public class LoginService {
	public void login() {
		//user listesine ihtiyaç var 
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService= context.getBean(UserService.class);
	}
}
