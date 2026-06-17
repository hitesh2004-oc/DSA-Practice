package Recursive;

public class P15 {
	static void f(int arr[],int a,int b) {
		if(a>b) return;
		
		int c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
		f(arr,a+1,b-1);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		f(arr,0,arr.length-1);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
}
