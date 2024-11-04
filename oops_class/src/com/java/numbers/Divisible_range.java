package com.java.numbers;

import java.util.Scanner;

public class Divisible_range {
    public static void main(String[] args) {
        System.out.println("Enter the range of numbers:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count =0;
        
        for(int i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3, 4, and 5.");
                
            } 
            
            else if(i % 3 == 0 && i % 4 == 0) {
                System.out.println(i + " is divisible by 3 and 4.");
     
            } 
            
            else if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5.");
              
            }
            
            else if(i % 4 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 4 and 5.");
             
            }
            
            else if(i % 3 == 0) {
                System.out.println(i + " is only divisible by 3.");
            }
            
            else if(i % 4 == 0) {
                System.out.println(i + " is only divisible by 4.");
                
            }
            
            else if(i % 5 == 0) {
                System.out.println(i + " is only divisible by 5.");
            }
            
        }
        scanner.close();
    }
}
