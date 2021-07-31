package com.gradle.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {

	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		LOG.info("Name: {}", name);
		return "Hello, "+name;
	}
}
