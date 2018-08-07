package com.revature.day1;

public class RollerCoasterLauncher {
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		RollerCoaster rollerCoaster7000 = new RollerCoaster(12, 9, 5, "Roller Coast 7000");
		System.out.println(rollerCoaster7000.getName());
		System.out.println(rollerCoaster7000.getRating());
		System.out.println(rollerCoaster7000);
	}
}
