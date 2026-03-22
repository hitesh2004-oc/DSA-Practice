package PracticesSession;

public class P6 {
	public static void reverse(int arr[] , int start , int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		reverse(nums ,0 ,nums.length-1);
		reverse(nums ,0 ,k-1);
		reverse(nums ,k ,nums.length-1);
		
		for(int num :nums) {
			System.out.print(num+" ");
		}
		
	}

}
