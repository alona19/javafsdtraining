package com.ust.examples;
class super_class{
	int x=20;
	
	public void display() {
		
		
		System.out.println("this is a super class");
	}
	
	
}


class Example33 extends super_class{
	int num=10;
	
public void display1() {
		
		System.out.println("this is a sub class");
	}

public void my_method() {
	
	Example33 s1=new Example33();
	
	s1.display1();
	
	super.display();
	
	System.out.println("this is sub num:: "+s1.num);
	System.out.println("this is sub num:: "+super.x);
	
	
	
}
public static void main(String[] args) {
	Example33 s2=new Example33();
	s2.my_method();
	
}

	
}
 