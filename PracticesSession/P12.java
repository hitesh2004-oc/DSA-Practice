package PracticesSession;

public class P12 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,4,3,7,9,8};
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>max) {
				second = max;
				max = arr[i];
			}
			if(arr[i] > second && arr[i] < max) {
           	 second = arr[i];
           }
		}
		System.out.println(second);
	}

}
