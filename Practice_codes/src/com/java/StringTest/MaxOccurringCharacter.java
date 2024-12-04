package com.java.StringTest;
import java.util.Scanner;

public class MaxOccurringCharacter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("The maximum occurring character is: " + getMaxOccurringChar(input));
        scanner.close();
    }

    public static char getMaxOccurringChar(String str) {
        int[] frequency = new int[256]; 
        int max = 0; 
        char result = ' ';

        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        for (char ch : str.toCharArray()) {
            if (frequency[ch] > max) {
                max = frequency[ch];
                result = ch;
            }
        }
        return result;
    }
}
