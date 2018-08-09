package com.revature.day4;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i = 1; i <= 1000000; i++) {
			System.out.println("i = " + i);
		}
	}	
}
