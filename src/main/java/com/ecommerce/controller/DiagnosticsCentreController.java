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

import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.service.DiagnosticsCentreServices;

@RestController
@RequestMapping(path="/dc")
public class DiagnosticsCentreController {
	@Autowired
	DiagnosticsCentreServices diagnosticscentreservices;
	
	@PostMapping(path="/addDc")
	public ResponseEntity<DiagnosticsCentre> addDiagnosticsCentre(@RequestBody DiagnosticsCentre diagnosticscentre){
		DiagnosticsCentre addedDiagnosticsCentre = diagnosticscentreservices.addDiagnosticsCentre(diagnosticscentre);
		return new ResponseEntity<DiagnosticsCentre>(addedDiagnosticsCentre, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getDc")
	public ResponseEntity<List<DiagnosticsCentre>> getDiagnosticsCentre(){
		List<DiagnosticsCentre> diagnosticsCentre = diagnosticscentreservices.getDiagnosticsCentre(); 
		return new ResponseEntity<List<DiagnosticsCentre>>(diagnosticsCentre, HttpStatus.OK);
	}
}
