package com.ust.examples;

public class Example6 {


	String name;
	int pages;
	static String b;
	
	public static void main(String[] args) {
		
		int a=0;
		do {
			
		b="e"+a;
		Example6 b=new Example6();
		b.name="book "+a;
		b.pages=100+(a*10);
		System.out.println(b.name);
		System.out.println(b.pages);
		a++;
		}while(a<5);
		
	}

}
