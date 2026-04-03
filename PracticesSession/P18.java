package PracticesSession;

public class P18 {
	// Bubble Sorting
	public static void main(String[] args) {
		int arr[] = {1,4,6,2,8,3};
		for(int i = arr.length - 1; i>=0; i--) {
			int m = arr[i];
			int ind = i;
			for(int j = 0; j<i; j++) {
				if(arr[j]>m) {
					m = arr[j];
					ind = j;
				}	
			}
			int t = arr[ind];
			arr[ind] = arr[i];
			arr[i] = t;
		}
		for(int i : arr)
		System.out.println(i);
	}

}
