package com.revature.screens;

import java.util.Scanner;

public class LoginScreen implements Screen {
	private Scanner scan = new Scanner(System.in);

	@Override
	public Screen start() {
		System.out.println("Enter Username: ");
		String username = scan.nextLine();
		System.out.println("Enter Password: ");
		String password = scan.nextLine();
		
		if(username.equals("blake") && password.equals("pass")) {
			return new HomeScreen();
		}
		return this;
	}

}
