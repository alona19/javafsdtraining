package com.ust.examples;

class base{
	final void display() {
		System.out.println("this is base class");
		
	}
}
	
	class derived extends base{
		void display1() {
			System.out.println("this is derived class");
		}
	}
	


public class ExampleBase {

	public static void main(String[] args) {
		derived d =new derived();
		d.display();
		d.display1();
		
		
	}

}
