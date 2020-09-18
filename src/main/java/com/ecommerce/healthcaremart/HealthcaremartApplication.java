package com.ecommerce.healthcaremart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.model.DiagnosticsCentre;

@SpringBootApplication
@EntityScan({"com.ecommerce.model"})
@EnableJpaRepositories({"com.ecommerce.dao"})
@ComponentScan({"com.ecommerce.service"})
@ComponentScan({"com.ecommerce.controller"})
public class HealthcaremartApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcaremartApplication.class, args);
	}
}
