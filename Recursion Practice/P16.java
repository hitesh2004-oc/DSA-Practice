package Recursive;

import java.util.ArrayList;
import java.util.List;

public class P16 {
	static void f(int arr[], int i, List<Integer> temp) {
		// BC (Base Case) For Stop
		if(i == arr.length) {
			System.out.print("Subset is: ");
		for(int el:temp){
		   System.out.print(el+" ");
		 }
		 System.out.println();
		return;
		}
		// RC(Recursive Case) For Repeat
		//Include
		temp. add (arr [i] );
		f(arr, i+1, temp);
		temp.remove(temp.size() - 1); // BackTracking
		
		//Exclude
		f(arr, i+1, temp);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		List<Integer> al = new ArrayList<>();
		f(arr, 0, al);
	}

}
