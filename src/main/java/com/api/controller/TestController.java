package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.TestService;

@RestController
@RequestMapping("/restAPI")
public class TestController {

	@Autowired
	private TestService testService;
	
	@GetMapping("/test/{st}")
	public String greetMsg(@PathVariable String st) {
		return "Welcome to the family "+st;
	}
	
	@GetMapping("/sum")
	public int add() {
		return testService.add();
	}
}
