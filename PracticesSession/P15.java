package PracticesSession;

public class P15 {
	public static void main(String[] args) {
		String str = "regexsoftware";
	    int arr[] = new int[26];
	    for(int i = 0; i<str.length();i++) {
	    	int a = str.charAt(i);
	    	arr[a - 'a']++;
	    }
	    char ch = 'a';
	    
	    for(int i = 0; i<arr.length;i++) {
	    System.out.println(ch+"->"+arr[i]);
	    ch++;
	    }
	    
	}

}
