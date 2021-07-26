package com.ust.examples;
/*
 * abstract examples
 */
 abstract class bank1{
	 int x;
	 abstract int interestRate(int x);
	
}
 
 class HDFC extends bank1{
	 
	 
	 int interestRate(int x) {
		 return x;
	 }
 }

 class ICICI extends bank1{
	 int x;
	 int interestRate(int x) {
		 return x;
	 }
	 
 }
 
public class test_bank {

	public static void main(String[] args) {
		HDFC b=new HDFC();
		b.x=10;
		System.out.println(b.interestRate(10));
		bank1 c=new HDFC();
		c.x=10;
		
		c=new ICICI();
		c.x=11;
		
		
		

	}

}
