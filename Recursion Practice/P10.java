package Recursive;

public class P10 {
	static boolean f(int arr[],int i) {
		 if(arr.length == i) return true;
		 
		 if(arr[i]>arr[i-1]) return f(arr,++i);
		 else return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(f(arr,1));
	}

}
