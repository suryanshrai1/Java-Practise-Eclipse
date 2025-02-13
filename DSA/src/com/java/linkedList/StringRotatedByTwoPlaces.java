package com.java.linkedList;

import java.util.Scanner;

public class StringRotatedByTwoPlaces {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        int n = s1.length();
        
        // If the length is less than 2, we cannot rotate
        if (n < 2) {
            return s1.equals(s2); // They must be equal if length is less than 2
        }
        
        // Generate left rotation
        String leftRotated = s1.substring(2) + s1.substring(0, 2);
        // Generate right rotation
        String rightRotated = s1.substring(n - 2) + s1.substring(0, n - 2);
        
        // Check if either rotation matches s2
        return leftRotated.equals(s2) || rightRotated.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        
        // Check if s2 is a rotation of s1 by 2 places
        boolean result = isRotated(s1, s2);
        
        // Output the result
        if (result) {
            System.out.println("The second string can be obtained by rotating the first string by exactly 2 places.");
        } else {
            System.out.println("The second string cannot be obtained by rotating the first string by exactly 2 places.");
        }
        
        // Close the scanner
        scanner.close();
    }
}