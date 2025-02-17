package com.kadirpasaoglu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kadirpasaoglu.model.User;
import com.kadirpasaoglu.services.UserService;

@Configuration 
public class AppConfig {
	@Bean
	public UserService userService() {
		 UserService userService = new UserService();
		 List<User> users = new ArrayList<>();

		 users.add(new User("Kadir"));
		 users.add(new User("Ayse"));
		 users.add(new User("Mehmet"));

		 userService.setUserList(users);
		 return userService;
	}
}
