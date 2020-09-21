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

import com.ecommerce.dto.EndpointsDTO;
import com.ecommerce.model.Endpoints;
import com.ecommerce.service.EndpointServices;


@RestController
@RequestMapping(path="/endpoint")
public class EndpointController {
	@Autowired
	EndpointServices endpointservices;
	
	@PostMapping(path="/addEndpoints")
	public ResponseEntity<Endpoints> addEndpoint(@RequestBody EndpointsDTO endpointsdto){
		Endpoints addedEndpoint = endpointservices.addEndpoint(endpointsdto);
		return new ResponseEntity<Endpoints>(addedEndpoint, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getEndpoints")
	public ResponseEntity<List<Endpoints>> getEndpoints(){
		List<Endpoints> endpoints = endpointservices.getEndpoint();
		return new ResponseEntity<List<Endpoints>>(endpoints, HttpStatus.OK);
	}
}
