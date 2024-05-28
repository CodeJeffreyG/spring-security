package com.jeffreyG.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String sayWelcome() {

		return "Welcome to string App without security";
	}
}
