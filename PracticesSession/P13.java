package PracticesSession;

import java.util.HashMap;
import java.util.Map;

public class P13 {
	public static void main(String[] args) {
		  int nums[] = {1,2,3};
		  int k = 3;
		  int n=nums.length;
	        int cnt=0;
	        int sum=0;
	        Map<Integer,Integer> mp = new HashMap<>();
	        mp.put(0,1);
	        for(int i=0;i<n;i++)
	        {
	            sum+=nums[i];
	            int find=sum-k;
	            if(mp.containsKey(find))
	                cnt+=mp.get(find);
	            mp.put(sum,mp.getOrDefault(sum,0)+1);
	        }
	        System.out.println(cnt);
	}

}
