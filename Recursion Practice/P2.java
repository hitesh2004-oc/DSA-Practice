package Recursive;

public class P2 {
	  public static int fibonacci(int n){
		  // Base Case
		  if(n<=1) return n;
		 
		  // Recursive Case
	      return fibonacci(n-1) + fibonacci(n-2);
	    }
	public static void main(String[] args) {
		
		System.out.println(fibonacci(3));
	}
}
