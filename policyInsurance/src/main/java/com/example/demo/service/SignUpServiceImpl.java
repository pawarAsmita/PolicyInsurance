package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.SignUp;
import com.example.demo.repos.SignUpRepository;

@Service
public class SignUpServiceImpl implements SignUpService {
	
	@Autowired
	SignUpRepository suRepo;

	@Override
	public SignUp saveUserData(SignUp suObj) {
		// TODO Auto-generated method stub
		return suRepo.save(suObj);
	}

	@Override
	public SignUp checkUserExist(String login_id, String password) {
		// TODO Auto-generated method stub
		return suRepo.findByLoginIdAndPassword(login_id, password);
	}

}
