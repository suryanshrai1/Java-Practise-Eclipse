package com.java.string;

public class reverseString {

    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Space between words
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        reverseString solution = new reverseString();
        
        // Test cases
        String input1 = "the sky is blue";
        String input2 = "  hello world  ";
        String input3 = "a good   example";
        String input4 = "  Bob    Loves  Alice   ";
        String input5 = "Alice does not even like bob";

        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + solution.reverseWords(input1) + "\"");
        
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + solution.reverseWords(input2) + "\"");
        
        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Output: \"" + solution.reverseWords(input3) + "\"");
        
        System.out.println("Input: \"" + input4 + "\"");
        System.out.println("Output: \"" + solution.reverseWords(input4) + "\"");
        
        System.out.println("Input: \"" + input5 + "\"");
        System.out.println("Output: \"" + solution.reverseWords(input5) + "\"");
    }
}