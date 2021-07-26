package com.ust.examples;
/*
 * 
 * Methods
 * 
 */
public class Example8 {
	int x;
	int y;
	
	int calculate(int a,int b) {
		int z;
		z=a+b;
		return z;
	}
	 float calculate(float a,float b) {
		float z;
		z=a+b;
		return z;
	}
	 
	 String calculate(String a,String b) {
			
			return a+b;
		}
	 void calculate(String b) {
			
			
		}
	 
	 
	 {
		 int z=5;
		 System.out.println(z);
	 }
	 
	 
	 
	public static void main(String[] args) {
		Example8 e=new Example8();
		int out=e.calculate(5,6);
		float out1=e.calculate(5.5f,6.2f);
		System.out.println(out);
		System.out.println(out1);
	}

}
