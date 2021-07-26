package com.ust.examples;

public class Example49 {
	
	
	
	static class Nested_Demo {
		
		
		public void my_method() {
		System.out.println("This is my nested class");
		}
		}

	public static void main(String[] args) {
		
		
		Example49.Nested_Demo nested = new Example49.Nested_Demo();
		nested.my_method();


	}

}
