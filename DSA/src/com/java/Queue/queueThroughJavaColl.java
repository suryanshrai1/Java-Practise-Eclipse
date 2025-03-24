package com.java.Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class queueThroughJavaColl {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		System.out.println("Queue after adding elements: ");
		System.out.println(queue);
		
		queue.remove(40);
		queue.remove(30);
		System.out.println("Queue after removing elements: ");
		System.out.println(queue);
		
		queue.offer(50); // to add elements
		queue.poll(); // to remove elements
		System.out.println(queue);
		
		
		
		
		
	}
}
