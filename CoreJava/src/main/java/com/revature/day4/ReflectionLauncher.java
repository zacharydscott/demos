package com.revature.day4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.revature.day1.RollerCoaster;

public class ReflectionLauncher {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		RollerCoaster rc = new RollerCoaster(1, 1, 1, "ok");
		
		Field f = rc.getClass().getDeclaredField("name");
		f.setAccessible(true);
		f.set(rc, "modified illegally");

		
		String s2 = "hello world";
		System.out.println(s2.replaceAll(" ", ""));
		
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(5000);
		arr.add(2);
		System.out.println(arr.contains(5000));
	}

}
