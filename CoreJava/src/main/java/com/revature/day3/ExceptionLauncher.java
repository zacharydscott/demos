package com.revature.day3;

import com.revature.day1.RollerCoaster;

public class ExceptionLauncher {
	public static void main(String[] args) {
		ExceptionLauncher el = new ExceptionLauncher();
		try {
			RollerCoaster rc = el.login("blakes", "pass");
			System.out.println(rc);
		} catch (Exception e) {
			System.out.println("failed to login");
			e.printStackTrace();
		}
	}	
	
	public RollerCoaster login(String username, String password) throws Exception{
		if("blake".equals(username) && "pass".equals(password)) {
			return new RollerCoaster(1, 1, 1, "my roller coaster");
		}
		
		throw new Exception();
	}
}
