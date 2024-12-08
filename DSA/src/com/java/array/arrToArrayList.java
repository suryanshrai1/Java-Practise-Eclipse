package com.java.array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrToArrayList {
    public static void main(String[] args) {
        // Create an array of strings.
        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        // Create an ArrayList of strings and initialize it with the contents of the array.
        ArrayList list = new ArrayList(Arrays.asList(my_array));

        // Print the ArrayList to the console.
        System.out.println(list);
    }
}
