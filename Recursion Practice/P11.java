package Recursive;

public class P11 {
	static boolean f(int arr[],int i,int t) {
		 if(arr.length == i) return false;
		 
		 if(arr[i]==t) return true;
		 else return f(arr,++i,t);
	}
	public static void main(String[] args) {
		
	
	int arr[] = {1,10,3,4,5,6};
	int t = 10;
	System.out.println(f(arr,0,t));
	}

}
