package com.ust.examples;

public class Example26 {

	
	int x;
	float y;
	String z;
	
	Example26(){
		
		
	}
	Example26 (int x,float y){
		//this(String z);
		this.x=x;
		this.y=y;
		
		
	}
	Example26 (int x,float y,String z){
		this(x,y);
		//this.x=x;
		//this.y=y;
		this.z=z;
		
	}
	
	public static void main(String[] args) {
		
Example26 e1=new Example26();
		
		System.out.println(e1.x);
		
		Example26 e2=new Example26(2,3.5f);
		
		System.out.println(e2.x);
		
Example26 e3=new Example26(2,3.5f,"alona");
		
		System.out.println(e3.z);
		
		
	}

}
