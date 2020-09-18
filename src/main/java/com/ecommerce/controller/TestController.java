package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.model.Tests;
import com.ecommerce.service.TestServices;

@RestController
@RequestMapping(path="/test")
public class TestController {
	@Autowired
	TestServices testservices;
	
	@PostMapping(path="/addTests")
	public ResponseEntity<Tests> addEndpoint(@RequestBody Tests tests){
		Tests addedTests = testservices.addTest(tests);
		return new ResponseEntity<Tests>(addedTests, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getTests")
	public ResponseEntity<List<Tests>> getTests(){
		List<Tests> tests = testservices.getTest();
		return new ResponseEntity<List<Tests>>(tests, HttpStatus.OK);
	}
	
}
