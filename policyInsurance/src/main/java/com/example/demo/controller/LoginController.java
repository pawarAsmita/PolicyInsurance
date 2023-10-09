package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.SignUp;
import com.example.demo.service.SignUpService;

import ch.qos.logback.core.model.Model;

@Controller
public class LoginController {

	@Autowired
	SignUpService suservice;

	@RequestMapping("/login")
	public String displayIndexJsp() {
		System.out.println("To display login jsp");
		return "login";

	}

	@PostMapping("/dashboard")
	public String loginUser(@RequestParam("login_id") String login_id, @RequestParam("password") String password) {
		boolean userExists = suservice.checkUserExist(login_id, password) != null;
		ModelAndView mv = new ModelAndView();
		if (userExists) {
			System.out.println("If user exist>>>");
			return ("redirect:dashboard");
		} else {
			System.out.println("If user not exist>>>");
			mv.addObject("error", "Invalid login credentials. Please sign up first.");
			return ("redirect:/");
		}

	}

	@RequestMapping("/signup")
	public String displaySignUp() {
		System.out.println("To display signup jsp");
		return "signup";
	}

	@PostMapping("/signup")
	public String signup(@RequestParam("login_id") String login_id, @RequestParam("password") String password,
			@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("email") String email, @RequestParam("mobile") Long mobile) {

		ModelAndView mv = new ModelAndView();
		if (login_id.isEmpty() || password.isEmpty()) {
			mv.addObject("error", "Login ID and Password cannot be blank.");
			return "signup";
		}

		SignUp suObj = new SignUp();
		suObj.setLogin_id(login_id);
		suObj.setPassword(password);
		suObj.setName(name);
		suObj.setAddress(address);
		suObj.setEmail(email);
		suObj.setMobile(mobile);
		System.out.println("print setData>>>" + suObj);
		suservice.saveUserData(suObj);
		return "redirect:/";

	}

	@RequestMapping("/dashboard")
	public String displayDashboard() {
		System.out.println("To display dashboard jsp");
		return "dashboard";

	}

}
