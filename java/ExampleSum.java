package com.ust.examples;

abstract class sum{
	
	public abstract int sumOfTwo(int i,int y);
	public abstract int sumOfThree(int i,int y,int z);
}

class sum1 extends sum{
	
	public int sumOfTwo(int i,int y){
		 
		 return i+y;
	 }
	public int sumOfThree(int i,int y,int z) {
		
		return i+y+z;
	}
	
	public void display() {
		System.out.println("this is sum sub class");
	}
	
}

public class ExampleSum {

	public static void main(String[] args) {
		
		sum1 s1=new sum1();
		System.out.println(s1.sumOfTwo(14,14));
		System.out.println(s1.sumOfThree(12,12,12));
		s1.display();
		
	}

}
