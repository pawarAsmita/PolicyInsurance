package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Policy;

public interface PolicyService {

	Policy addPolicyData(Policy pobj);
	
	List<Policy> gePolicies();
	
	void deleteByPolicy(int Id);
	

}
