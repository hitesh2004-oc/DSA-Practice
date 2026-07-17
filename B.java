package com.hitesh;
class hi {
    hi() {
        show();
    }
    void show() {
        System.out.println("A");
    }
}
class hello extends hi {
    int x=10;
    hello() { 
   
    }
    void show() {
        System.out.println(x);
    }
}
public class B {
	public static void main(String[] args) {
       new hello(); 
     	}
	}

