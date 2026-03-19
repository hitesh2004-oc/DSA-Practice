package PracticesSession;

import java.util.HashMap;
import java.util.Map;

public class P3 {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,5,2,4,4};
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
//			if(mp.containsKey(arr[i]))
//			{
//				int v = mp.get(arr[i]);
//				v++;
//				mp.put(arr[i], v);
//			}
//			else mp.put(arr[i], 1);
//			
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(mp);
	}

}
