package com.ust.examples;

public class Example51 {
	private int data=30; 
	void display(){
		 int value=50;
		class Local{  
			  
			void msg(){System.out.println(value);
			
			  }  
	  }  
		
	 Local l=new Local();  
	 l.msg();  
	 
	 }  


	public static void main(String[] args) {
		Example51 obj=new Example51();  
		obj.display();  


	}

}
