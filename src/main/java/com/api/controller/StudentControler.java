package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class StudentControler {
    
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public String greetMsg() {
	return "Welcome to the application,";
    }
}
