package com.java.strings;

import java.util.Scanner;

public class MaxChr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            System.out.println("String is empty. Please enter a valid string.");
        } else {
            char maxChar = findMaxOccurringChar(input);
            System.out.println("Maximum occurring character: " + maxChar);
        }
        
        scanner.close();
    }

    private static char findMaxOccurringChar(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        
        int maxCount = -1;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }
        
        return maxChar;
    }
}
