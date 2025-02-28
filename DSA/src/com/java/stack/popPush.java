package com.java.stack;

import java.util.Scanner;
import java.util.Stack;

public class popPush {
    private Stack<Integer> stack; // Using built-in Stack class

    // Constructor to initialize the stack
    public popPush() {
        stack = new Stack<>(); // Initialize the stack
    }

    public void push(int value) {
        stack.push(value);
        System.out.println("Value pushed: " + value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack underflow!");
            return -1; // Return -1 to indicate underflow
        } else {
            return stack.pop();
        }
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int value : stack) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        popPush myStack = new popPush(); // Create an instance of PopPush

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    int value = sc.nextInt();
                    myStack.push(value);
                    break;
                case 2:
                    int poppedValue = myStack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Value popped: " + poppedValue);
                    }
                    break;
                case 3:
                    myStack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        
        sc.close();
    }
}