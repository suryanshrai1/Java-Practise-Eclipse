package sample_codes;

import java.util.Scanner;

public class AddSub {
    public AddSub() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum, diff;
        
        System.out.println("Please enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        num2 = scanner.nextInt();
        
        sum = num1 + num2;
        diff = num1 - num2;
        
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        scanner.close();
    }
}
