package com.java.string;

import java.util.Scanner;

class StringRotationChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            System.out.print("Enter first string: ");
            String s1 = sc.nextLine(); // Read the first string
            System.out.print("Enter second string: ");
            String s2 = sc.nextLine(); // Read the second string

            Solution obj = new Solution();
            boolean flag = obj.isRotated(s1, s2); // Check if s2 is a rotation of s1

            // Print the result
            System.out.println(flag ? "true" : "false");
            System.out.println("~"); // Print separator
        }
        sc.close(); // Close the scanner
    }
}

class Solution {
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
}