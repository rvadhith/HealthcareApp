package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.TestRepo;
import com.ecommerce.model.Tests;

@Service
public class TestServices {
	@Autowired
	TestRepo testrepo;
	
	public List<Tests> getTest(){
		return testrepo.findAll();
	}
	
	public Tests addTest(Tests test){
		return testrepo.save(test);
	}
}
