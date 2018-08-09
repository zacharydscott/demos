package com.revature.day4;

public class WatingThread implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("waiting thread started");
			Thread.currentThread().join();
			System.out.println("waiting thread finished");
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
	}

}
