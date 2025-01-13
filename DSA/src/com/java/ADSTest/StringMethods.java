package com.java.ADSTest;

public class StringMethods {
	public static void main(String[] args) {
		String str1= "Sharda";
		String str2 = "University";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println(str1.concat(str2));
		
		String str3 = str1.copyValueOf(str1.toCharArray(), 0, str1.length());
		System.out.println(str3);
		
		System.out.println(str2.toLowerCase()); // similarly toUpperCase 
		
		System.out.println("To check equality: "+ str1.equals(str3));
		
		
		
	}

}
