import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the principle: ");
		int p =sc.nextInt();
		System.out.println("Enter the rate: ");
		int r= sc.nextInt();
		System.out.println("ENter the time: ");
		int t =sc.nextInt();
		int si = (p*r*t)/100;
		
		System.out.println("The simple Interest is: "+ si);
	}
}
