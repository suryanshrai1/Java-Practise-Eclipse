import java.util.Scanner;

public class Right_Rotation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        int m = scanner.nextInt();
	        
	        int[] arr = new int[m];
	        
	        System.out.println("Enter " + m + " elements:");
	        for (int i = 0; i < m; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Enter the number of rotations: ");
	        int k = scanner.nextInt();
	        
	        k = k % m;  // Adjust k to avoid unnecessary full rotations

	        if (k > 0) {
	            int[] temp = new int[k];
	            for (int i = 0; i < k; i++) {
	                temp[i] = arr[m - k + i];
	            }
	            for (int i = m - 1; i >= k; i--) {
	                arr[i] = arr[i - k];
	            }
	            for (int i = 0; i < k; i++) {
	                arr[i] = temp[i];
	            }
	        }
	        
	        System.out.println("Array after rotation:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        scanner.close();
	    }
}

