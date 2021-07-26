package com.ust.examples;

public class Example50 {
	private int data=30; 
	void display(){  
		System.out.println(data);
		class Local{  
			  
			void msg(){System.out.println(data);
			
			  }  
	  }  
		
	 Local l=new Local();  
	 l.msg();  
	 
	 }  


	public static void main(String[] args) {
		Example50 obj=new Example50();  
		obj.display();  

	}

}
