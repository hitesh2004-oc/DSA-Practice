package PracticesSession;

public class P22 {
	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = "46786";
		
//		int a1 = Integer.parseInt(s1);
//		int a2 = Integer.parseInt(s2);
//		
//		int c = a1+a2;
		// Addition of Two String without Using Inbuilt Method 
		String str = "";
		for(int i = s1.length() - 1; i>=0;i--) {
			for(int j = s2.length()-1 ; j>= 0; j--) {
				if(s1.charAt(i) + s2.charAt(j) < 10) {
					 int a = s1.charAt(i);
					 int b = s2.charAt(j);
					 int c = a + b;
					 char ch = (char) c;
					 str = str + ch;
				}
				
			}
		}
	
		System.out.println(str);
	}

}
