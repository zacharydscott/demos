package com.revature.day2;

public class ScopesLauncher {
	public static void main(String[] args) {
		Scopes s = new Scopes();
		System.out.println(s.someField);
		s.myMethod(4);
		System.out.println(Scopes.belongsToTheClass);
	}
}
