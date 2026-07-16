package com.hitesh;

import java.util.Scanner;

class student{
	private int id;
	private String name;
	private int rollno; 
	private String email;
	  
	public void setA(int id,String name,int rollno,String email) {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.email=email;
	}
	public int geta() {
		return id;
	}
	public String getb() {
		return name;
	}
	
}

public  class A {
	student s1 = new student();
	
	   void display() {
		   s1.setA(101,"hitesh",1011,"h@gmail.com");
		   System.out.println("ID :- "+s1.geta());
		   System.out.println("NAME :- "+s1.getb());
	   }
 
	public static void main(String[] args) {
		A a1 = new A();
		a1.display();
			   }
	}

