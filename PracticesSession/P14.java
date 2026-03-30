package PracticesSession;

import java.util.HashMap;

public class P14 {
	public static void main(String[] args) {
		int nums[] = {2,4,6,9,7};
		int k = 2;
		
		  if(k == 1 || k == nums.length){
	            HashMap<Integer,Integer> hm = new HashMap<>();
	            for(int i : nums) hm.put(i,hm.getOrDefault(i,0)+1);
	            int max = -1;
	            for(Integer i : hm.keySet()) {
	                if(hm.get(i) == 1){
	                    if(hm.get(i)>max) max = hm.get(i);
	                }
	            }
	            System.out.println(max);
	           
	        }else {
	        int first = nums[0];
	        int last = nums[nums.length - 1];
	        int a = 0;
	        int b = 0;
	        for(int i = 0; i<nums.length; i++)
	        {
	           if(first == nums[i])  a++;
	           if(last == nums[i]) b++;
	        }
	        int c = 0;
	        int d = -1;
	        if(a == 1) {
	             c = nums[0];
	        }
	        if(b == 1){
	             d = nums[nums.length-1];
	        }
	        if(c>d) System.out.println(c);
	        else System.out.println(d);;
	        }
	}

}
