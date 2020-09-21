package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.DiagnosticsCentreRepo;
import com.ecommerce.dao.PackageRepo;
import com.ecommerce.dao.TestRepo;
import com.ecommerce.dto.PackageDTO;
import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.model.Packages;
import com.ecommerce.model.Tests;

@Service
public class PackageServices {
	@Autowired
	PackageRepo packagerepo;
	@Autowired
	TestRepo testrepo;
	@Autowired
	DiagnosticsCentreRepo diagnosticsCentreRepo;
	
	public List<Packages> getPackages(){
		return packagerepo.findAll();
	}
	
	public Packages addPackages(PackageDTO packagedto) {
		Optional<DiagnosticsCentre> diagnosticCenter = null;
		List<Tests> tests = null;
		
		Packages packages = new Packages();
		
		diagnosticCenter = diagnosticsCentreRepo.findById(packagedto.getDiagnosticcentre_id());
		tests = testrepo.findAllById(packagedto.getTests_id());
		
		packages.setName(packagedto.getName());
		packages.setStartDate(packagedto.getStartDate());
		packages.setValidTillDate(packagedto.getValidTillDate());
		packages.setAvailableSeats(packagedto.getAvailableSeats());
		packages.setCost(packagedto.getCost());
		packages.setDiagnosticcentre(diagnosticCenter.get());
		packages.setTests(tests);
		return packagerepo.save(packages);
	}	
}
