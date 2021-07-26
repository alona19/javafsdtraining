package com.ust.examples;

 class Bank {
	
	
private int acoountnum;
private String name;
private float accountBalance;

void printBankDetails() {
	
	System.out.println(acoountnum+name+accountBalance);
}

void insertDetails(int x,String y,float z) {
	
	acoountnum=x;
	name=y;
	accountBalance=z;
	
}
}
 public class Example27 {
	public static void main(String[] args) {
		Bank p1=new Bank();
		p1.insertDetails(14,"alona",25000);
		
		p1.printBankDetails();

	}

}
