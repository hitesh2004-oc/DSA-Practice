package PracticesSession;

import java.util.HashMap;
import java.util.Random;

public class P4 {
	public static void main(String[] args) {
		int arr[] = {1,2,2,2,4,4,2,2};
		int n = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:arr) {
        	hm.put(num, hm.getOrDefault(num, 0)+1);
        	
        	if(hm.get(num)>n/2) {
        		System.out.println(num);
        		break;
        	}
        }
		
//		Random r = new Random();
//		int a = (int) ((double) r.nextFloat() * 10000);
//		System.out.println(a);
	}

}
