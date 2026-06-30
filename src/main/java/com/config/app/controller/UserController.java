package com.config.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	private String welcome() {
		return """
				************************************ 
                Welcome to ND Application : 3384
                ************************************

                Available APIs

                GET    /view/{id}
                POST   /create
                PUT    /update/{id}
                DELETE /delete/{id}

                Version : 3.0
                Status  : Running Successfully
				""";
	}
	
	@GetMapping("/created-by")
	public String createdBy() {
		return "RAJU - 30/06/2026";
	}

}
