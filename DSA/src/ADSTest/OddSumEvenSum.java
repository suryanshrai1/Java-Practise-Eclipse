package ADSTest;

import java.util.Scanner;

public class OddSumEvenSum {
	static int arr[] = {2,3,4,5};
	static int oddsum=0;
	static int evensum=0;
	public static void main(String[] args) {
		System.out.println("ENter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int arrsize =sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		for(int i =0; i<arrsize; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i= 0; i< arrsize; i++) {
			if(arr[i]%2 !=0) {
				oddsum+= arr[i];
			}
			else {
				evensum+= arr[i];
			}
		}
		System.out.println("The sum of odd numbers in the array is: "+ oddsum);
		System.out.println("The sum of even numbers in the array is: "+ evensum);
	}
}
