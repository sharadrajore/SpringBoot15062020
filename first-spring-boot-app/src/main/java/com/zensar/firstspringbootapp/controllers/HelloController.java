package com.zensar.firstspringbootapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Controller
public class HelloController {
	
	
	@RequestMapping("/")
	//@ResponseBody
	public String sayHello() {
		return "<h2> Welcome to Spring Boot </h2>";
	}

}
