package com.java.linkedList;

import java.util.LinkedList;

public class createLinkedListThroughFramework {
	public static void main(String[] args) {
		LinkedList <String> l1= new LinkedList<String>();
		LinkedList <String> l2= new LinkedList<String>();

		l1.add("Ten");
		l1.add("20");
		l1.add("30");
		l1.add("40");
		l1.add("50");
		
		l1.addFirst("70");
		
		l1.add(1, "80");
		
		l1.addLast("60");
		
		
				
		System.out.println(l1);
		
		System.out.println(l1.contains("20"));  // contains method
		
		System.out.println(l1.getLast());
		
		
		
		l1.clear(); // deletes all the elements of the linked list
		System.out.println(l1);
		
		
	}
	
}
