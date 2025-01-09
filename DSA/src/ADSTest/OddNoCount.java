package ADSTest;

public class OddNoCount {
	static int arr[] = {12,345,2,3,7};
	static int count=0;
	public static void main(String[] args) {
		for(int i= 0; i< arr.length; i++) {
			if(arr[i]%2 !=0) {
				count ++;
			}
		}
		System.out.println("The number of odd values are: "+ count);
	}

}
