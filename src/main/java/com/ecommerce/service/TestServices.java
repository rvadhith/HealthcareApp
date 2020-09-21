package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.DiagnosticsCentreRepo;
import com.ecommerce.dao.EndpointRepo;
import com.ecommerce.dao.TestRepo;
import com.ecommerce.dto.TestDTO;
import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.model.Endpoints;
import com.ecommerce.model.Tests;


@Service
public class TestServices {
	@Autowired
	TestRepo testrepo;
	@Autowired
	DiagnosticsCentreRepo diagnosticsCentreRepo;
	@Autowired
	EndpointRepo endpointrepo;
	
	public List<Tests> getTest(){
		return testrepo.findAll();
	}
	
	public Tests addTest(TestDTO testdto){
		Optional<DiagnosticsCentre> diagnosticCenter = null;
		List<Endpoints> endpoints = null;
		
		Tests tests = new Tests();
		
		//Fetching the Dc value and assign
		diagnosticCenter = diagnosticsCentreRepo.findById(testdto.getDiagnosticcentre_id());
		endpoints = endpointrepo.findAllById(testdto.getEndpoints_id());
		
		tests.setName(testdto.getName());
		tests.setStartDate(testdto.getStartDate());
		tests.setValidTillDate(testdto.getValidTillDate());
		tests.setAvailableSeats(testdto.getAvailableSeats());
		tests.setCost(testdto.getCost());
		tests.setDiagnosticcentre(diagnosticCenter.get());
		tests.setEndpoints(endpoints);
		return testrepo.save(tests);
	}
}
