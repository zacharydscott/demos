package com.revature.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.revature.day1.RollerCoaster;

public class CollectionLauncher {
	public static void main(String[] args) {
		List<RollerCoaster> rollerCoasters = new ArrayList<>();
		System.out.println(rollerCoasters);
		rollerCoasters.add(new RollerCoaster(1, 1, 1, "one"));
		rollerCoasters.add(new RollerCoaster(2, 1, 1, "two"));
		rollerCoasters.add(new RollerCoaster(500, 10, 2, "blake"));
		System.out.println(rollerCoasters.get(2));

		Set<RollerCoaster> setOf = new HashSet<>();
		setOf.addAll(rollerCoasters);
		System.out.println(setOf);
		for(RollerCoaster r: setOf) {
			System.out.println(r.getRating());
		}
		
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("fish", "3");
		dictionary.put("david", "also 3");
		dictionary.put("new", "old dictionary");
		System.out.println(dictionary.get("new"));
	
		for(String key: dictionary.keySet()) {
			System.out.println(key + ": " + dictionary.get(key));
		}
		
	}
}
