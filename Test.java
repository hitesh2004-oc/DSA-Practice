package com.hitesh;

public class Test {
	public static void main(String[] args) {
		//......Use of String......
		//...There Are Two Way to Create String
		//..(1) Create String Liternal
		String str1 = "Java"; //Store in Special Memory Area Called SCP(String Constant Pool)
		
		//..(2) Using New Keyword Create String
		String str2 = new String("Java");
		
		//Equals is Method of Object class where it is Define
		// It is Simply Check the Content
		System.out.println(str1.equals(str2)); 
		System.out.println(str1 == str2); //It is Check Reference
		
		//Method Of String
		//.concat()
		String s1 = "hitesh";
		s1.concat("malviya"); // Create new object
		System.out.println(s1);
		
		//.charAt()
		System.out.println(s1.charAt(3));
		
		//.trim() remove spaces starting or Ending
		String s2 = "     Java      ";
		System.out.println(s2.trim());
		
		//.replace() or .replaceAll()
	   System.out.println(s2.replace(" ",""));
	   System.out.println(s2.replaceAll("\\s",""));
	   
	   //.endswith() or startsWith()
	   System.out.println(s1.endsWith("h"));
	   System.out.println(s1.startsWith("H"));
	   
	   //.intern()
	   String st1 = new String("Prasoon");
	   String st2 = "Prasoon";
	   
	   System.out.println(st1 == st2);// that is Give false 
	   String st3 = new String("Prasoon").intern();
	   System.out.println(st1 == st3);// Both Are refer to same object
	   
	   
		
		
	}

}
