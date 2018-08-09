package com.revature.day4;

public class BlockingUtil {
	public synchronized void blockingMethod() throws InterruptedException {
		System.out.println("started from " + Thread.currentThread().getName());
		Thread.sleep(3000);
		System.out.println("done from " + Thread.currentThread().getName());
	}
}
