package com.jwt.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String text = "Welcome to JWT implementation";
		return ResponseEntity.ok(text);
	}
}
