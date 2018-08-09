package com.revature.day4;

public class JoiningThread implements Runnable {
	private Thread t;
	
	public JoiningThread(Thread t) {
		this.t = t;
	}

	@Override
	public void run() {
		try {
			System.out.println("started joining thread");
			t.join();
			System.out.println("ending joining thread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
