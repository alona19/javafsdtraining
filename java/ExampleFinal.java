package com.ust.examples;

/*
 * 
 * final method,class,variable
 */

public class ExampleFinal {
	int a;
	
final int y;

ExampleFinal(){
		a=5;
	y=7;
	
}

	public static void main(String[] args) {
		
		
		ExampleFinal e=new ExampleFinal();
		e.a=10;
		//e.b=4;
		System.out.println(e.a);
		System.out.println(e.y);
		final int x=10;
		System.out.println(x);
		//x=7;
		//System.out.println(x);
	}

}
