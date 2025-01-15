package com.java.HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map ageMap = new HashMap<>();
		
		ageMap.put("Alice", 22);
		ageMap.put("Bob", 29);
		ageMap.put("Charlie", 35);
		
		System.out.println(ageMap);
		
		System.out.println("Charlie's age is: "+ ageMap.get("Charlie"));
		
		System.out.println("Removing 1 element: Bob");
		ageMap.remove("Bob");
		
		System.out.println("SIze after removal: "+ ageMap.size());
		
		
	}
}
