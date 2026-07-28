package com.PracticeSession;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n =sc.nextInt();
		
		for(int i=4;n>0;i+=3) {
				System.out.print(i+" ");
				n--;
			}
			
		}
		

}
