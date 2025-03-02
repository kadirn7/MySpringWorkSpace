package com.kadirpasaoglu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = {"com.kadirpasaoglu"})
@EntityScan(basePackages = {"com.kadirpasaoglu"})
@EnableJpaRepositories(basePackages = {"com.kadirpasaoglu"})
@SpringBootApplication
public class GaleristApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GaleristApplicationStarter.class, args);
	}

}
