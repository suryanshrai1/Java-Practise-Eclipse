package com.java.stack;
import java.util.*;

public class pushPop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println("Stack after removing elements:");
		s.pop();
		s.pop();
		System.out.println(s);
	}

}
