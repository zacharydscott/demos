package com.revature.day2;

public class GarbageLauncher {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10000000; i++) {
			new Trash(i);
		}
		
	}
}
