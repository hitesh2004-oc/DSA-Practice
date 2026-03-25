package PracticesSession;

import java.util.HashSet;

public class P9 {
	public static void main(String[] args) {
		int arr[] = {7,1,2,1,2,5,6};
		HashSet<Integer> hs = new HashSet<>();
		for(int i : arr) {
			hs.add(i);
		}
		System.out.println(hs.size());
		System.out.println(hs);
	}

}
