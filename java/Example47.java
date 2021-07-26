package com.ust.examples;

public class Example47 {
	
	int x=5;
	String name;
	
	void outerMethod() {
		System.out.println("Inside outer method");
		class Inner{
			
			int y =x;
			
			void innerMethod() {
				System.out.println("Inside inner method");
				System.out.println(y);
				
			}
		}
		
		Inner y=new Inner();
		y.innerMethod();
		
	}

	public static void main(String[] args) {
		Example47 e1=new Example47();
		
		
		e1.outerMethod();
		

	}

}
