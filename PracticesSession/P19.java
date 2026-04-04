package PracticesSession;

public class P19 {
	// Insert Sorting
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		for(int i = 1; i<arr.length; i++) {
			int a = i;
			for(int j = i; j>=0; j--) {
				if(arr[a] < arr[j]) {
					int t = arr[a];
					arr[a] = arr[j];
					arr[j] = t;
					a--;
				}
			}
		}
		for(int i : arr)
			System.out.println(i);
		
	}

}
