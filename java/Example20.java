package com.ust.examples;
/*
 * Constructor
 * 
 */

public class Example20 {

	
	int x;
	float y;
	String z;
	
	Example20(){}
	Example20 (int x,float y){
		this.x=x;
		this.y=y;
	}
	Example20 (int x,float y,String z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	
	public static void main(String[] args) {
		Example20 e1=new Example20();
		
		System.out.println(e1.x);
		
		Example20 e2=new Example20(2,3.5f);
		
		System.out.println(e2.x);
		
Example20 e3=new Example20(2,3.5f,"alona");
		
		System.out.println(e3.z);
		
		
		
		
		
		
		
		

	}

}
