package com.simplilearn.demo;

import java.util.regex.*;

public class Authentication {
	public boolean authenticate(String Email, String password){
		
		String email = "Vyshi@1432";
		String pass = "vyshi";
		String emailPatern = "^(.+)@(.+)$";
		Pattern p = Pattern.compile(emailPatern);
		Matcher m = p.matcher(Email);
		if(m.matches())
		{
			if(email.equals(Email) && pass.equals(password))
				return true;
			else
				return false;
		}
		return false;
		
	}
}