package com.java.numbers;

public class PrimeNo {
    static int count = 0;

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        count = 0; 
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2; 
    }

    public static void main(String[] args) {
        int num = 7; 
        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}