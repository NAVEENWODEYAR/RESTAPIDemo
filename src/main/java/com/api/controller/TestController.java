package com.api.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

	@GetMapping("/test/{st}")
	public String greetMsg(@PathVariable String st) {
		return "Welcome to the family "+st;
	}
}
