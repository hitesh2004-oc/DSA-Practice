package PracticesSession;

import java.util.ArrayList;
import java.util.List;

public class P10 {
	public static void main(String[] args) {
		int numRows = 5;
		 List<List<Integer>> ans = new ArrayList<>();
         List<Integer> prev = new ArrayList<>();
          List<Integer> temp = new ArrayList<>();
       temp.add(1);
       ans.add(temp);
     if(numRows == 1){
       System.out.println(ans);
     }
     prev.add(1);
     prev.add(1);
     ans.add(prev);
     if(numRows == 2){
       System.out.println(ans);
     } 
     for(int i = 2; i<numRows; i++){
             List<Integer> curr = new ArrayList<>();
       curr.add(1);
       int size = prev.size();
       for (int j = 1; j < size; j++) {
               curr.add(prev.get(j - 1) + prev.get(j));
           }
     curr.add(1); 
     ans.add(curr);
      prev = curr;
 }
	}

}
