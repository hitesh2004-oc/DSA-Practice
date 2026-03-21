package PracticesSession;

public class P5 {
	public static boolean reversed(int nums[]) {
	  int i = 0;
	  int j = nums.length - 1;
	  while(i<j) {
		  if(nums[i] != nums[j]) return false;
		  i++;
		  j--;
	  }
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		int i = 0;
		int j = arr.length - 1;
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
					
		}
		for(int a:arr) System.out.println(a);
		
		System.out.println(reversed(arr));
	}

}
