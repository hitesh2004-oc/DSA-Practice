package PracticesSession;

public class P24 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int t = 7;
		int i = 0;
		int j = arr.length -1;
		int mid = 0;
		int ans = 0;
		while(i<=j) {
			mid = i+j/2;
			if(arr[mid] == t) {
				System.out.print(true);
				break;
			}
			if(arr[mid]>t) {
				
			}
		}
	}

}
