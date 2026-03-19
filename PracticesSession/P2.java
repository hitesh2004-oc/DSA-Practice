package PracticesSession;

public class P2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
	    boolean flag = false;
	    int target = 8;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				flag = true;
			}
		}
		if(flag) System.out.println("Yes");
		else System.out.println("No");
	}

}
