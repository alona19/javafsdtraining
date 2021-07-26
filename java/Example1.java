package com.ust.examples;
/*This program will help to
 * depict the use 
 * of instance variable
 * local variable
 * and static variable
 * 
 * 
 * 
 * 
 */

public class Example1 {
	String name ;
	double num;
	static int count;
	
	public static void main(String args[])
	{
		int age =10;
		System.out.println(age);
		Example1 e =new Example1();
		e.name="alona";
		e.num=4.0;
		count=8;
		System.out.println(e.name);
		System.out.println(e.num);
		System.out.println(count);
	
		
		
		
	}
}
