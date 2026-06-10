package Recursive;

public class P8 {
	static int a = 0;
	static int f(int arr[]) {
		if(arr.length == a) return 0;
		
		return arr[a++] + f(arr);
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,2};
		System.out.println(f(arr));
	}

}
