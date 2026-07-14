package com.hitesh;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int i, j;
		System.out.println("Enter Elements: -");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix: -");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Rotation of Matrix: -");
		for (i = 0; i < 3; i++) {
			for (j = 2; j >= 0; j--) {
				System.out.print(arr[j][i] + " ");

			}
			System.out.println();
		}

	}

}
