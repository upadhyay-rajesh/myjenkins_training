package com.demojenkinsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MyController {
	
	@GetMapping
	public String sayHello() {
		return "i am hello from api";
	}

}
