package PracticesSession;

public class P23 {
	public static void main(String[] args) {
		 int arr[] = {3,5,8,7,-2,-3,2};
		 int max = 0;
		 for(int i = 0;i< arr.length; i++ ) {
			 int sum = 0;
			 for(int j = i;j<arr.length; j++) {
				 sum = sum+arr[j];
				 if(max<sum) {
					 max = sum;
				 }
			 }
			 
		 }
		 System.out.println(max);
		
	}

}
