package Recursive;


public class P13 {
	static int lastOccurrence(int arr[], int i) {
        if(i == 0) return arr[i];

        return lastOccurrence(arr, i - 1);
    }
	public static void main(String[] args) {
		  int arr[] = {2, 4, 6, 6, 8, 5, 4};
	        System.out.println(lastOccurrence(arr, arr.length - 1));
	    }
	}


