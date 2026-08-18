package com.hitesh;

import java.util.Arrays;
//...Check Anagram or Not...//
public class Anagram {
	public static void main(String[] args) {
		// Step 1
		String str1 = "School Master";
		String str2 = "The Classroom";

		// Step 2
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();

		// Step 3 Convert
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		// Step 4 Sort 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// Step 5 Check
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}
}
