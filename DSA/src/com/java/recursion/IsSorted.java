package com.java.recursion;

import java.util.Scanner;

public class IsSorted {
	public static boolean isSorted(int n, int arr[]) {
		if (n == 0 || n == 1) {
			return true;
		}
		// Check if the last two elements are in order
		if (arr[n - 1] < arr[n - 2]) {
			return false;
		}

		return isSorted(n - 1, arr);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 90, 30, 40 };
		int n = arr.length;
		boolean res = isSorted(n, arr);

		if (res) {
			System.out.println("The array is sorted.");
		} else {
			System.out.println("The array is not sorted.");
		}
	}
}


