package com.hitesh;

import java.util.Arrays;
//...Check Anagram or Not...//
public class Anagram {
	public static void main(String[] args) {
		String str1 = "School Master";
		String str2 = "The Classroom";

		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}
}
