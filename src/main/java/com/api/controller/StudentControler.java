package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class StudentControler {
    
    @GetMapping("/msg")
    @ResponseStatus(code = HttpStatus.OK)
    public String greetMsg() {
	return "Welcome to the application,";
    }
    
    @GetMapping("responseEntity")
    public ResponseEntity<String> response(){
	return new ResponseEntity<String>("RESPONSEENTITY", HttpStatus.ACCEPTED);
    }
}
