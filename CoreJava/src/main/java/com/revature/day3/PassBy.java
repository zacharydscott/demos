package com.revature.day3;

import com.revature.day1.RollerCoaster;

public class PassBy {
	public static void main(String[] args) {
		PassBy pb = new PassBy();
		int i = 5;
		pb.method(i);
		System.out.println(i);
		
		RollerCoaster rc = new RollerCoaster(1, 5, 5, "Obliterator");
		pb.method2(rc);
		System.out.println(rc);
	}
	
	public void method2(RollerCoaster rc) {
		rc.setRating(1);
		rc = null;
		System.out.println(rc);
		return;
	}
	
	public void method(int i) {
		i++;
		System.out.println(i);
		return;
	}
}
