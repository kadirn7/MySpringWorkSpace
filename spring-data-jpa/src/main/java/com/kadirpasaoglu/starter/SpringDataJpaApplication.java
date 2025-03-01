package com.kadirpasaoglu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EntityScan(basePackages = {"com.kadirpasaoglu"})
@ComponentScan(basePackages = {"com.kadirpasaoglu"})
@EnableJpaRepositories(basePackages = {"com.kadirpasaoglu"})
@EnableConfigurationProperties
@PropertySource(value="classpath:app.properties")
@EnableScheduling
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
