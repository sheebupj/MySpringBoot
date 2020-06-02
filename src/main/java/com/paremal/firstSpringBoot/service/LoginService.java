package com.paremal.firstSpringBoot.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	String validUsername="sheebu";
	String validPassword="password";
	
	public boolean validateCredential(String userid, String password ) {
		
		if(userid.equalsIgnoreCase(validUsername)&&password.equals(validPassword)) {
			return true;
		}
		return false;
	}

}
