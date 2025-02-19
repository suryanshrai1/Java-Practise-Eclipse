package com.java.recursion;
// THe difference is only that we reduced the stack height to logn
public class xPowN_heightLogn {
	public static int calcPow(int x, int n) {
		if(n== 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		//Even n
		if (n %2 == 0) {
			int result = calcPow(x, n/2);
			return calcPow(x, n/2) * calcPow(x, n/2);
		}
		else {
			return calcPow(x, n/2) * calcPow(x, n/2) * x;
		}
	}
	
	public static void main(String[] args) {
		int x =2, n =3;
		int res = calcPow(x,n);
		System.out.println(res);
	}
}

