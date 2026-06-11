package Recursive;

public class P9 {
	static int max = 0;
	
	static int f(int arr[],int i) {
		  if(i == arr.length) return max;
		  
	      if(arr[i] > max) max = arr[i];
	      return f(arr, i + 1);
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,2};
		System.out.println(f(arr,0));
	}
}
