package com.ust.examples;


abstract class car1{
	int x;
	abstract void insuaranceDetails() ;
	void display() {
		
	}
}


	

public class abstact_class extends car1 {
	
void insuaranceDetails() {
	
	System.out.println("this is insurance policy and please provide the details");
	
	
}
	public static void main(String[] args) {
		
		//car c= new car();
		abstact_class a1=new abstact_class();
		
		car1 c=new abstact_class();
		c.insuaranceDetails();
		//abstact_class a2=new car();
		a1.insuaranceDetails();
		
		
		
	}

}
