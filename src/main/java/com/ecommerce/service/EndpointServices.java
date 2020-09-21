package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.DiagnosticsCentreRepo;
import com.ecommerce.dao.EndpointRepo;
import com.ecommerce.dto.EndpointsDTO;
import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.model.Endpoints;


@Service
public class EndpointServices {
	@Autowired
	EndpointRepo endpointrepo;
	@Autowired
	DiagnosticsCentreRepo diagnosticsCentreRepo;
	
	public List<Endpoints> getEndpoint() {
		return endpointrepo.findAll();
	}
	
	@Transactional
	public Endpoints addEndpoint(EndpointsDTO endpointdto) {
		Optional<DiagnosticsCentre> diagnosticCenter = null;
		Endpoints endpoint = new Endpoints();
		
		//Fetching the Dc value and assign
		diagnosticCenter = diagnosticsCentreRepo.findById(endpointdto.getDiagnosticcentre_id());
		endpoint.setName(endpointdto.getName());
		endpoint.setDiagnosticcentre(diagnosticCenter.get());
		return endpointrepo.save(endpoint);
	}
}
