package com.mydemo.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(path = "/sayHi")
	public ResponseEntity<String> sayHello()
	{
		System.out.println("Hi Hello from My Demo Application");
		return new ResponseEntity<String>("Hi Hello from My Demo Application", HttpStatus.OK);
	}
}
