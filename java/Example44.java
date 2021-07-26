package com.ust.examples;
/*
 * 
 * Example of inner class
 * 
 */

public class Example44 {
	 int x=5;
	 Example44(int x){
		 this.x=x;
	 }
	
	
	private void display(){
		System.out.println("outer class");
		
	}
	
	
	public class Inner{
		 int y;
		// x=4;
	void display1() {
		System.out.println(Example44.this.x);
	}
		Inner(int y,int x){

			this.y=y;
			Example44.this.x=x;
			
		}
		void display() {
			System.out.println("example of inner class");
		}
	}

	public static void main(String[] args) {
		
		Example44.Inner e1=new Example44(5).new Inner(6,5);
		
		Example44 e2=new Example44(7);
		//Example44.Inner e3=e2.new Inner(5);
	
		//e2.display();
		//e2.x=5;
		e1.display1();
		//System.out.println(e2.x);
		e1.display();
		
	
	}

}
