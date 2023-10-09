package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Policy;
import com.example.demo.repos.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyRepository prepo;

	@Override
	public Policy addPolicyData(Policy pobj) {
		// TODO Auto-generated method stub
		return prepo.save(pobj);
	}

	@Override
	public List<Policy> gePolicies() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public void deleteByPolicy(int Id) {
		// TODO Auto-generated method stub
		prepo.deleteById(Id);
		
	}

	

}
