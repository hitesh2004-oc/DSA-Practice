package PracticesSession;

public class P1 {
	public static void main(String[] args) {
		int arr[] = {10,7,6,8,3,8};
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum = (sum + arr[i])%7;
		}
	     System.out.println(sum);
	}

}
