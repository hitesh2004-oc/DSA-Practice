package com.PracticeSession;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n =sc.nextInt();
		for(int i = 4; n>0 ; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				n--;
			}
		}
	}

}
