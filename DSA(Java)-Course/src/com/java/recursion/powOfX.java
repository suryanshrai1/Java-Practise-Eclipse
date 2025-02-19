package com.java.recursion;

public class powOfX {
	public static int calcPow(int x, int n) {
		if(n== 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		
		int result = calcPow(x, n-1);
		return x * result;
	}
	
	public static void main(String[] args) {
		int x =2, n =3;
		int res = calcPow(x,n);
		System.out.println(res);	
	}
}
