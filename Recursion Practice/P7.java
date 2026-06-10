package Recursive;

public class P7 {
	static int f(int n) {
		if(n == 0) return 0;

        if(n%10 == 0) return 1 + f(n/10);
        else return f(n/10);

	}
	public static void main(String[] args) {
		System.out.println(f(100000));
	}

}
