package com.kadirpasaoglu.main;


import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


import com.kadirpasaoglu.config.AppConfig;
import com.kadirpasaoglu.services.LoginService;
import com.kadirpasaoglu.services.UserService;
import com.kadirpasaoglu.model.User;

public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService= context.getBean(UserService.class);
		
		for(User user: userService.getUserList()) {
			System.out.println(user);
		}
		
		LoginService loginService= new LoginService();
		loginService.login();
	}

}
