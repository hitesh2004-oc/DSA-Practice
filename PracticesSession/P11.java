package PracticesSession;

import java.util.ArrayList;
import java.util.List;

public class P11 {
	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> l = new ArrayList<>();
		List<Integer> prev = new ArrayList<>();
		prev.add(1);
		l.add(prev);

		for(int i = 1; i<n;i++) {
			List<Integer> curr = new ArrayList<>();
			curr.add(1);
			
			for(int j = 1; j<prev.size();j++) {
				curr.add(prev.get(j) + prev.get(j-1));
			}
			curr.add(1);
			l.add(curr);
			prev = curr;
		}
		System.out.println(l);
	}

}
