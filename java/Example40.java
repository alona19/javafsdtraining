package com.ust.examples;

class mark{
	int x;
	int y;
	 mark(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(" super class constructor ");
	}
}
class mathss extends mark{
	int z;
	mathss(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	void display() {
		
	}
	
	
}
public class Example40 {

	public static void main(String[] args) {
		mathss m1=new mathss(2,4);
		
		

	}

}
