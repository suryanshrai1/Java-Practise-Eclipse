package com.java.ExceptionTest;
import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (Num1): ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second integer (Num2): ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
