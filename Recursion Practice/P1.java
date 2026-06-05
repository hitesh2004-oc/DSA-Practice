package Recursive;

class P1 {
    public static int factorial(int n){
        // Base case
        if(n == 0) return 1;
        
        // Recursive case
        int aff = factorial(n-1);
        return n * aff;
    }
    public static void main(String[] args) {
    
        System.out.print(factorial(5));
       
    }
}