package com.example.demo.service;

import com.example.demo.entities.SignUp;

public interface SignUpService {
	
SignUp saveUserData (SignUp suObj);
	
	SignUp checkUserExist(String login_id, String password);

}
