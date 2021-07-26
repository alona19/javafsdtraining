package com.ust.examples;

public class Example48 {
	static class Inner { 
		public void show() { 
		System.out.println("In a nested class method"); 
		} 
		}

	public static void main(String[] args) {
		//Example48.Inner in = new Example48().new Inner(); 
		Example48.Inner in =new Example48.Inner();
		in.show(); 


	}

}
