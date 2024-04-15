/**
 * 
 */
package com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 
 */
@RestController
@RequestMapping("/laptop")
public class LapController {

	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("Welcome to Swagger UI,");
	}
}
