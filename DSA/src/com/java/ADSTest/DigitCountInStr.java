package com.java.ADSTest;

public class DigitCountInStr {
	public static void main(String[] args) {
        String input = "Hello123, this is a test456!";
        int digitCount = countDigits(input);
        System.out.println("Number of digits in the string: " + digitCount);
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

