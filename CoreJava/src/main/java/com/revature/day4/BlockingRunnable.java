package com.revature.day4;

public class BlockingRunnable implements Runnable{
	private BlockingUtil bu;
	
	public BlockingRunnable(BlockingUtil bu) {
		this.bu = bu;
	}
	
	@Override
	public void run() {
		try {
			bu.blockingMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
