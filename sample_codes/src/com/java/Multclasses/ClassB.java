package com.java.Multclasses;

public class ClassB{
	public void CallingClassA() {
	
		ClassA obj = new ClassA();
		System.out.println("Sum is :" + obj.Sum());
}
}
