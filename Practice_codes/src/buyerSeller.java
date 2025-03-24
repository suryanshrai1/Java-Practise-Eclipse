

import java.util.Scanner;

public class buyerSeller {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of candies to buy: ");
		int toBuy = sc.nextInt();
		int limit = 25;
		
		if(toBuy <= 25) {
			limit = limit - toBuy;
			System.out.println("no of candies buyed :" + toBuy);
			if(limit < 15) {
				limit = 25;
			}
		}
		System.out.println("No of candies left : "+ limit);
		
		if(toBuy > 25) {
			System.out.println("Not enough candies. Please try again !");
		}
	}
}








