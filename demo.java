package com.hitesh;

import java.util.Scanner;

public class demo {
	
	 public static void main(String[] args) {
		int n;
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n; j++) {
				if(i == n || j == i || j == 1) System.out.print("* ");
				else System.out.print("  ");
				
			}
			for(int j = n - 1; j >= 1; j--) {
				if(i == n || j == i || j == 1) System.out.print("* ");
				else System.out.print("  ");
				
			}
			System.out.println();
		  }
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == n || j == i || j == 1) System.out.print("* ");
				else System.out.print("  ");
				
			}
			for(int j = n - 1; j >= 1; j--) {
				if(i == n || j == i || j == 1) System.out.print("* ");
				else System.out.print("  ");
				
			}
			System.out.println();
		  }
		
	    }
	 
	  }
  
