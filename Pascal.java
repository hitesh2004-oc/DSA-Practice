package DSA;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
          List<Integer> prev = new ArrayList<>();
           List<Integer> temp = new ArrayList<>();
        temp.add(1);//{1}
        ans.add(temp);// {{1}}
      if(numRows == 1){
        return ans;
      }
      prev.add(1);
      prev.add(1);
      ans.add(prev);
      if(numRows == 2){
        return ans;
      } 
      for(int i = 3; i<numRows; i++){
              List<Integer> curr = new ArrayList<>();
        curr.add(1);
        int size = prev.size();
      for(int j = 1 ; j<numRows; j++){
    	     curr.add(prev.get(j - 1) + prev.get(j));
      }

      curr.add(1); 

      ans.add(curr);
      prev = curr;
  }

      
        return ans;
    }
}
public class Pascal {
	public static void main(String[] args) {
		
	}
	

}
