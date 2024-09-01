package com.api.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownContentTypeException;

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
	public ResponseEntity<?> consumeApi1(){
		log.debug("Debugger");
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://dummy.restapiexample.com/api/v1/employees";
		Object dummyData = restTemplate.getForObject(url, Object.class);
//		return ResponseEntity.ok(restTemplate.getForObject("https://www.linkedin.com/feed/", Object.class));
		return ResponseEntity.ok(dummyData);
	}
	   @GetMapping("/consumeApi")
	    public ResponseEntity<String> consumeApi() {
	        String url = "https://www.linkedin.com/feed"; // Replace with the actual URL
			RestTemplate restTemplate = new RestTemplate();
	        try {
	            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
	            return response;
	        } catch (UnknownContentTypeException ex) {
	            // Handle the case where the response content type is not what is expected
	            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Unsupported content type");
	        } catch (RestClientException ex) {
	            // Handle other errors
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + ex.getMessage());
	        }
	    }
}
