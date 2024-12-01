package com.java.arrayList;
import java.util.ArrayList;

public class removeELem {
	  public static void main(String[] args){
		  
		    // create an ArrayList
		    ArrayList<String> Shapes = new ArrayList<>();
		 
		    // Add elements to ArrayList
		    Shapes.add("Rectangle");
		    Shapes.add("Circle");
		    Shapes.add("Triangle");
		    Shapes.add("Square");
		    System.out.println("ArrayList: " +Shapes);
		    // remove element from index 2
		    String str = Shapes.remove(2);
		    System.out.println("Updated ArrayList: " +Shapes);
		    System.out.println("Removed Element: " + str);
		  }

}


