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

import com.ecommerce.dto.PackageDTO;
import com.ecommerce.model.Packages;
import com.ecommerce.service.PackageServices;

@RestController
@RequestMapping(path="/package")
public class PackageController {
	@Autowired
	PackageServices packageservices;
	
	@PostMapping(path="/addPackages")
	public ResponseEntity<Packages> addPackages(@RequestBody PackageDTO packagedto){
		Packages addedPackages = packageservices.addPackages(packagedto);
		return new ResponseEntity<Packages>(addedPackages, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getPackages")
	public ResponseEntity<List<Packages>> getPackages(){
		List<Packages> packages = packageservices.getPackages();
		return new ResponseEntity<List<Packages>>(packages, HttpStatus.OK);
	}
}
