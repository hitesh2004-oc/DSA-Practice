package Recursive;

public class P14 {
    static int bs(int arr[], int low, int high, int T) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(arr[mid] == T) {
            return mid;
        } else if(arr[mid] > T) {
            return bs(arr, low, mid - 1, T);
        } else {
            return bs(arr, mid + 1, high, T);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8};
        int t = 9;

        System.out.println(bs(arr, 0, arr.length - 1, t));
    }
}