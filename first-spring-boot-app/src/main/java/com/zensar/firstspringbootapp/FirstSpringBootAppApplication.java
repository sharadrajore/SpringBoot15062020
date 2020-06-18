package com.zensar.firstspringbootapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class FirstSpringBootAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// SpringApplication.run(FirstSpringBootAppApplication.class, args);

		new SpringApplicationBuilder(FirstSpringBootAppApplication.class)
		.properties("spring.config.name:application")
		.build()
		.run(args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

}
