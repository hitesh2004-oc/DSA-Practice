package PracticesSession;

public class P20 {
	// Counting Sort
	public static void main(String[] args) {
		int arr[]  = {4,5,1,1,1,7,9,1,2,2};
	       int fre[] = new int[10];
	       for(int i = 0; i<arr.length; i++){
	           fre[arr[i]]++;
	       }
	       int a = 0;
	       for(int i : fre){
	          for(int j = 1; j<=i; j++){
	              System.out.print(a+" ");
	          }
	          a++;
	       }
	}

}
