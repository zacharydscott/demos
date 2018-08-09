package com.revature.day4;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("starting my runnable");
			int i = 5;
			System.out.println(i);
			Thread.sleep(3000);
			i++;
			System.out.println(i);
		
			
			System.out.println("ending my runnable");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
