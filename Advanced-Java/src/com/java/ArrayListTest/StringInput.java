package com.java.ArrayListTest;

import java.util.Scanner;
import java.util.ArrayList;

public class StringInput {
    public static void main(String[] args) {
        String[] ArrayList = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            ArrayList[i] = str; 
        }  
        System.out.println("The strings you entered are: ");
        
        for (String s : ArrayList) {
            System.out.println(s);
        }
        sc.close();
    }
}