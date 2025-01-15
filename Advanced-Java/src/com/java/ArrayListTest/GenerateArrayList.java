package com.java.ArrayListTest;

import java.util.ArrayList;

public class GenerateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Generated ArrayList: " + list);
        
        list.add("Grape");
        System.out.println("Updated ArrayList: " + list);
    }
}
