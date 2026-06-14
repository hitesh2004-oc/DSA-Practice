package Recursive;

public class P12 {

    static int firstOccurrence(int arr[], int i,int t,int ans) {
        if(arr[i] == t) {
           	ans = i;
            return ans;
        }else return firstOccurrence(arr, i+1,t,ans);
        
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 6, 8, 5, 4};
        int t = 4;
        System.out.println(firstOccurrence(arr, 0,t,-1));
    }
}