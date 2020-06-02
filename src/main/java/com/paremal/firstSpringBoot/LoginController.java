package com.paremal.firstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.paremal.firstSpringBoot.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method  =RequestMethod.GET)
	public String loginMessage() {
		
		return "login";
	}
	
	@RequestMapping (value="/login" , method = RequestMethod.POST)
	public String loginMessage1(@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		if(!service.validateCredential(name, password)) {
			String errorMessage="Invalid Credentials";
			model.put("errorMessage",errorMessage);
			return "login";
		}
		model.put("name", name);
		return "welcome";
	}

}
