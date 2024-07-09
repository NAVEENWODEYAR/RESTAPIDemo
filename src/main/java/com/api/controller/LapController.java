package com.api.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @apiNote, Controller class for Laptop Entity,
 */
@RestController
@RequestMapping("/laptop")
@Slf4j
public class LapController {

	@GetMapping("/test")
	@ResponseStatus(code = HttpStatus.FOUND)
	public ResponseEntity<String> test(){
		log.warn("Warn Log");
		return ResponseEntity.ok("Welcome to Swagger UI,");
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> consumeApi(){
		log.debug("Debugger");
		RestTemplate restTemplate = new RestTemplate();
		
		return ResponseEntity.ok(restTemplate.getForObject("https://www.linkedin.com/feed/", Object.class));
	}
}
