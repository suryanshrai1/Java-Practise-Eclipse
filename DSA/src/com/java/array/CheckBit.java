package com.java.array;

public class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5; // Binary representation: 101
        int k = 0; // Check the 0-th bit (least significant bit)
        
        boolean isKthBitSet = checkKthBit(n, k);
        System.out.println("Is the " + k + "-th bit of " + n + " set? " + isKthBitSet);

        k = 1; // Check the 1-st bit
        isKthBitSet = checkKthBit(n, k);
        System.out.println("Is the " + k + "-th bit of " + n + " set? " + isKthBitSet);

        k = 2; // Check the 2-nd bit
        isKthBitSet = checkKthBit(n, k);
        System.out.println("Is the " + k + "-th bit of " + n + " set? " + isKthBitSet);
    }
}
