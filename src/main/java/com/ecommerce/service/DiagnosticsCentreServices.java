package com.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.DiagnosticsCentreRepo;
import com.ecommerce.model.DiagnosticsCentre;

@Service
public class DiagnosticsCentreServices {
	@Autowired
	DiagnosticsCentreRepo diagnosticscentrerepo;
	
	public List<DiagnosticsCentre> getDiagnosticsCentre() {
		return diagnosticscentrerepo.findAll();
	}
	
	@Transactional
	public DiagnosticsCentre addDiagnosticsCentre(DiagnosticsCentre diagnosticscentre) {
		return diagnosticscentrerepo.save(diagnosticscentre);
	}
}
