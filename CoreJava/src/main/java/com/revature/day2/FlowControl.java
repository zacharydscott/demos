package com.revature.day2;

public class FlowControl {
	public boolean b = true;
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		FlowControl fc = new FlowControl();
		fc.testIfMethod(null);
//		fc.testSwitch();
//		fc.testFor();
//		fc.testWhile();
//		fc.testDoWhile();
//		fc.testTernary();
	}
	
	private void testTernary() {
		// condition? return this if true: return this if false
		String s = "test: " + (5==5? "hello" : "world");
		System.out.println(s);
	}

	// DoWhile is like while, only it is guaranteed to execute at least once
	private void testDoWhile() {
		double i = 2000;
		do {
			i = Math.random() * 3000;
			System.out.println("insied do while loop i: " + i);
		} while(i < 1000);
		System.out.println("do while loop done");
	}

	// Use while if you do not know how many times it will iterate
	private void testWhile() {
		double i = 0;
		while(i < 1000) {
			i = Math.random() * 3000;
			System.out.println("insied while loop i: " + i);
		}
		System.out.println("while loop done");
	}

	// Use a for loop if you know exactly how many iterations should be performed
	private void testFor() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("for loop i: " + i);
		}
	}

	private void testSwitch() {
		int i = 3;
		switch (i) {
		case 1:
			System.out.println("option 1 selected");
			break;
		case 3:
			System.out.println("option 3 selected");
			break;
		case 2:
			System.out.println("option 2 selected");
			break;
		default:
			System.out.println("invalid option");
			break;
		}
	}

	public void testIfMethod(Object o) {
		if(o != null && b == true) {
			System.out.println("option 1");
		} else {
			System.out.println("option 2");
		}
	}
}
