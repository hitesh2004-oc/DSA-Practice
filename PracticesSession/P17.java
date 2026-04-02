package PracticesSession;

public class P17 {
	// Selection Sorting
	public static void main(String[] args) {
		int arr[] = {1,4,6,2,8,3};
		for(int i = 0; i<arr.length; i++) {
			int m = arr[i];
			int ind = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<m) {
					m = arr[i];
					ind = i;
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
