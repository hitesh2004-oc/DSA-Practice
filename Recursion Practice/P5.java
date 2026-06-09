package Recursive;

public class P5 {
         static void print(int n) {
        	 // Based Case
		 if(n<=-10) return;
		 
		 // Recursive Case
		 print(n-1);	
		 System.out.print(n+" ");
	}
	public static void main(String[] args) {
		print(0);
	}
}
