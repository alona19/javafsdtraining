package com.ust.examples;
//depicting the use of nested if condition
public class Example2 {
	float price;
	String item;
	boolean flag;

	public static void main(String[] args) {
		
		Example2 e1= new Example2();
		
		Example2 e2= new Example2();
		
		
		e1.price=1.2f;
		e2.price=1.3f;
		e1.item="pen";
		e2.item="book";
		
		if(!e1.flag) {
			System.out.println("hello");
		}
		
		if(e1.price>e2.price) {
			
			e1.item="scale";
		}
		if(e1.price < e2.price) {
			
			e1.item="pencil";
		}
		
		else if(e1.price==e2.price) {
			e1.flag=true;
			e1.item="box";
		}
 System.out.println(e1.item);
 System.out.println(e1.flag);
 
	}

}
