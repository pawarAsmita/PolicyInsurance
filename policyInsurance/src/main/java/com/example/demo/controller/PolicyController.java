package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Policy;
import com.example.demo.service.PolicyService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PolicyController {

	@Autowired
	PolicyService pservice;

	@RequestMapping("policy")
	public String displayPolicy() {
		System.out.println("display policy page>>>");
		return "policy";

	}

	@PostMapping("/savePolicy")
	public String savePolicydata(@RequestParam("policy") String policy, @RequestParam("tenure") Double tenure,
			@RequestParam("amount") double amount) {
		Policy pobj = new Policy();
		pobj.setPolicy(policy);
		pobj.setTenure(tenure);
		pobj.setAmount(amount);
		System.out.println("pobj>>" + pobj);
		pservice.addPolicyData(pobj);
		return "dashboard";

	}


	@GetMapping("/viewPortfolio")
	public String viewPortfolio(HttpServletRequest request) {
		try {
			System.out.println("Data we are getting :-  " + pservice.gePolicies());
			List<Policy> policies = pservice.gePolicies();
			request.setAttribute("policies", policies);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "viewPortfolio";
	}
	
	@RequestMapping("deletePolicy")
	public String displaydelete() {
		System.out.println("To show delete page jsp");
		return "deletePolicy";
		
	}
	
	@PostMapping("/deletePolicyMethod")
	public String deletePolicyByName(int Id) {
		System.out.println("is deleted");
		pservice.deleteByPolicy(Id);
		return "dashboard";
		
	}
	
	
	
	@GetMapping("/logout")
	public String logout() {
		System.out.println("to get logout>>");
		return "index";
		
	}
	
	

}