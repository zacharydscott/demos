package com.revature.day4;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.revature.day1.RollerCoaster;

public class ReflectionLauncher {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		RollerCoaster rc = new RollerCoaster(1, 1, 1, "ok");
		
		Field f = rc.getClass().getDeclaredField("name");
		f.setAccessible(true);
		f.set(rc, "modified illegally");
		
		System.out.println(rc);
		
		
		String s = "hello";
		String[] split = s.split("");
		System.out.println(Arrays.toString(split));
		
	}

}
