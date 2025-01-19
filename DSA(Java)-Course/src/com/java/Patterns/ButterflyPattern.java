package com.java.Patterns;

import java.util.Iterator;

public class ButterflyPattern {
	public static void main(String[] args) {
		int n=5;
		// Upper half
		for(int i=1; i<=n;i++) {
			// first part
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			//spaces
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
				
			}
			//second half
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lower half (same as first half but from n to1)
		
		for(int i=n; i>=1;i--) {
			// first part
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			//spaces
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
				
			}
			//second half
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

