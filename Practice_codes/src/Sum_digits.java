
// Program to add the digits of a number as input
import java.util.Scanner;

public class Sum_digits {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int num; int a; int res;int sum=0; 
		Scanner scanner = new Scanner(System.in);
		num= scanner.nextInt();
		while(num>0) {
			a = num %10;
			sum += a;
			num= num/10;
		}
		System.out.println("The sum of digits of the number is:"+ sum);
		
	}
	
}
