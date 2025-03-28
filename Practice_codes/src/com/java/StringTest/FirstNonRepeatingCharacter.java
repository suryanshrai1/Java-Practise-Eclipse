package com.java.StringTest;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char result = findFirstNonRepeatingChar(input);
        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters repeat in the string.");
        }
        
        scanner.close();
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256]; 

        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        for (char ch : str.toCharArray()) {
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        return 0; // If all characters repeat
    }
}
