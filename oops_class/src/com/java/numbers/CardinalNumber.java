package com.java.numbers;

//A program that distributes chocolates among 8 children  

public class CardinalNumber  
{  
int generateRandomNo()  
{  
//define the range  
int maximum = 10;  
int minimum = 1;  
int rng = maximum - minimum + 1;  

int randNo = (int)(Math.random() * rng) + minimum;  

return randNo;  
}  
   
//main method  
public static void main(String argvs[])  
{  

//creating an object of the class CardinalNumber  
CardinalNumber obj = new CardinalNumber();  

//loop to iterate till 8 to distribute  
//the chocoloates among 8 children  
for(int i = 1; i <= 8; i++)  
{  

int no = obj.generateRandomNo();  
if(i == 1)  
{  
System.out.println("The " + i + "st child got " + no + " chocoloates.");  
}  

else if(i == 2)  
{  
System.out.println("The " + i + "nd child got " + no + " chocoloates.");  
}  

else if(i == 3)  
{  
System.out.println("The " + i + "rd child got " + no + " chocoloates.");  
}  

else  
{  
System.out.println("The " + i + "th child got " + no + " chocolates.");  
}  


}  

}  
}  
