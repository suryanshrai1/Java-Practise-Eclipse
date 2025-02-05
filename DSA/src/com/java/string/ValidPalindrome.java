package com.java.string;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // Normalize the string
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        
        // Convert the filtered string to a character array
        String normalized = filteredString.toString();
        int len = normalized.length();

        // Check for palindrome
        for (int i = 0; i < len / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(len - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        
        // Test cases
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(solution.isPalindrome("race a car")); // Output: false
        System.out.println(solution.isPalindrome("")); // Output: true
        System.out.println(solution.isPalindrome("No 'x' in Nixon")); // Output: true
        System.out.println(solution.isPalindrome("Was it a car or a cat I saw?")); // Output: true
        System.out.println(solution.isPalindrome("12321")); // Output: true
        System.out.println(solution.isPalindrome("12345")); // Output: false
    }
}