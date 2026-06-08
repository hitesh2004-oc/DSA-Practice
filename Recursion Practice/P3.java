package Recursive;

public class P3 {
	  public static int sum(int n){
		  if(n==0) return 0;
		  int add = sum(n/10);
		  return n%10 + add;
	    }
	  
	public static void main(String[] args) {
		System.out.println(sum(598));
	}
}
