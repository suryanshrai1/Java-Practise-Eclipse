package com.java.arrayList;
import java.util.ArrayList;
public class accessArrayList {
	 public static void main(String[] args){
		 
		    // create an ArrayList
		    ArrayList<String> Shapes = new ArrayList<>();
		 
		    // Add elements to ArrayList
		    Shapes.add("Rectangle");
		    Shapes.add("Circle");
		    Shapes.add("Triangle");
		    Shapes.add("Square");
		    System.out.println("ArrayList: " +Shapes);
		    // get the element at postion 2 from the arraylist
		    String str = Shapes.get(1);
		    System.out.print("Element at 2nd position: " + str);    
	 }
}

