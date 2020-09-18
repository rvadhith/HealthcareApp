package com.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.EndpointRepo;
import com.ecommerce.model.Endpoints;

@Service
public class EndpointServices {
	@Autowired
	EndpointRepo endpointrepo;
	
	public List<Endpoints> getEndpoint() {
		return endpointrepo.findAll();
	}
	
	@Transactional
	public Endpoints addEndpoint(Endpoints endpoint) {
		return endpointrepo.save(endpoint);
	}
}
