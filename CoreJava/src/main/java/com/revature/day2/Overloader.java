package com.revature.day2;

import java.util.Arrays;

 /**
 * overloading has same name but different method signature by 
 * varying either number of parameters or the types of the parameters
 * 
 * overriding is same method signature in parent and child class
 * but the child class changes the implementation
 * 
 * 
 * @author USER
 *
 */

public class Overloader {
	public static void main(String... args) {
		Overloader o = new Overloader();
		o.overload(1,2,1,55,82,2);
	}
	
	public void overload() {
		System.out.println("called with no params");
	}
	public void overload(int i) {
		System.out.println("called with integer");
	}
//	public void overload(long l) {
//		System.out.println("called with long");
//	}
	public void overload(long l, int... others) {
		System.out.println("called with var args");
		System.out.println(Arrays.toString(others));
	}
	
	@Override
	public String toString() {
		return "hello";
	}
}
