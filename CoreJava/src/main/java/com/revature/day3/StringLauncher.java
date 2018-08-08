package com.revature.day3;

public class StringLauncher {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = new String("hello");
		System.out.println(s == s2);
		
		String s3 = s.substring(0,2);
		System.out.println(s3);
		String s4 = "he";
		System.out.println(s3.equals(s4));
		
		StringBuilder sb = new StringBuilder("hello");
		for(int i = 0; i < 10; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}
