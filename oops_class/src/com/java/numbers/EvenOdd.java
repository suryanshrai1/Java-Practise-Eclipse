package com.java.numbers;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}
