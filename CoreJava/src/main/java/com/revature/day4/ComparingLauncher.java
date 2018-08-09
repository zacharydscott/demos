package com.revature.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.day1.RollerCoaster;

public class ComparingLauncher {
	public static void main(String[] args) {
		List<RollerCoaster> rollerCoasters = new ArrayList<>();
		System.out.println(rollerCoasters);
		rollerCoasters.add(new RollerCoaster(1, 7, 1, "one"));
		rollerCoasters.add(new RollerCoaster(2, 3, 1, "two"));
		rollerCoasters.add(new RollerCoaster(500, 10, 2, "blake"));
		rollerCoasters.add(new RollerCoaster(2, 1, 2, "chris"));
		rollerCoasters.add(new RollerCoaster(1, 5, 2, "kevin"));
		System.out.println("before sort");
		for(RollerCoaster rc: rollerCoasters) {
			System.out.println(rc);
		}
		
		Collections.sort(rollerCoasters);
		System.out.println("after sort");
		for(RollerCoaster rc: rollerCoasters) {
			System.out.println(rc);
		}
		
		System.out.println("by capacity");
		rollerCoasters.sort(new RollerCoasterCapacityComparator());
		for(RollerCoaster rc: rollerCoasters) {
			System.out.println(rc);
		}
	}
}
