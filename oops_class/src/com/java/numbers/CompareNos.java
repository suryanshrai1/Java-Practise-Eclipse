package com.java.numbers;
import java.util.Scanner;

public class CompareNos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number (integer):");
        int fno = scanner.nextInt();
        
        System.out.println("Enter the second number (integer):");
        int sno = scanner.nextInt();
        
        System.out.println("Enter the third number (integer):");
        int tno = scanner.nextInt();
        
        System.out.println("Enter 'true' if the condition should ignore the first number comparison, otherwise enter 'false':");
        boolean abc = scanner.nextBoolean();
        
        boolean result = (abc || sno > fno) && tno > sno;
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
