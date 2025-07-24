package com.distribuida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//opcional
@EntityScan(basePackages = "com.distribuida.model")
@EnableJpaRepositories(basePackages = "com.distribuida.dao")
@ComponentScan(basePackages = "com.distribuida")
public class LibreriaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaSpringApplication.class, args);
	}

}
