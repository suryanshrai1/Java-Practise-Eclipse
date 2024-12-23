package com.java.Lambda;
// Write a program to implement lambda function to convert an integer to their corresponding binary representation.

import java.util.Scanner;
import java.util.function.Function;

public class IntegerToBinary  {
  public static void main(String[] args) {
	  System.out.println("Enter the first integer: ");
	  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Number: " + n);

    Function < Integer, String > convertToBinary = num -> Integer.toBinaryString(num);
    String binaryRepresentation = convertToBinary.apply(n);
    System.out.println("Binary representation: " + binaryRepresentation);
    n = 747;
    System.out.println("\nNumber: " + n);
    convertToBinary = num -> Integer.toBinaryString(num);
    binaryRepresentation = convertToBinary.apply(n);
    System.out.println("Binary representation: " + binaryRepresentation);
  }
}
