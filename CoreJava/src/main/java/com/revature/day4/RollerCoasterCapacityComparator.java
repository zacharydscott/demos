package com.revature.day4;

import java.util.Comparator;

import com.revature.day1.RollerCoaster;

public class RollerCoasterCapacityComparator implements Comparator<RollerCoaster> {

	@Override
	public int compare(RollerCoaster o1, RollerCoaster o2) {
		return o1.getMaxCapacity() - o2.getMaxCapacity();
	}

}
