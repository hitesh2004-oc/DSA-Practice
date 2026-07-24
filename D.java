package com.malviya;

import java.util.Scanner;

public class D {
	private int Eid;
	private String name;
	
	public void setA(int Eid,String name) {
		this.Eid=Eid;
		this.name=name;
	}
	public int getA() {
		return Eid;
	}
	public String getname() {
		return name;
	}
	
public static void main(String[] args) {
	D d1 = new D();
	d1.setA(101, "hitesh");
	System.out.println(d1.getA());
	System.out.println(d1.getname());
	

}
}

