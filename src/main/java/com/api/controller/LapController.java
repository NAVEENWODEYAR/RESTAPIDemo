/**
 * 
 */
package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

/**
 * 
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
}
