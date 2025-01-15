package com.java.ArrayListTest;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kivi");
        System.out.println("The original list is: " + fruits);

        System.out.println("Fruit at index 1: " + fruits.get(1));

        fruits.set(1, "Orange");
        System.out.println("List after updating: " + fruits);

        System.out.println("List after removing elements: " + fruits.remove("Apple"));
        System.out.println(fruits);

        System.out.println("Checking if the list contains Cherry? " + fruits.contains("Cherry"));

        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}



