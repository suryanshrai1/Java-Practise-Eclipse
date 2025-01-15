package com.java.ArrayListTest;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        System.out.println("The original list is: " + animals);

        System.out.println("Animal at index 1: " + animals.get(1));

        animals.set(1, "Parrot");
        System.out.println("List after updating: " + animals);

        System.out.println("List after removing elements: " + animals.remove("Dog"));
        System.out.println(animals);

        System.out.println("Checking if the list contains Horse? " + animals.contains("Horse"));

        System.out.println("Iterating through the list:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}

