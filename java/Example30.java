package com.ust.examples;


class one{
	
	public void print_geek(){
		
		System.out.print("geeks ");
		
	}
}

class two extends one{
public void print_for(){
		
		System.out.print("for ");
		
	}
	
	
}
public class Example30 {

	public static void main(String[] args) {
		
		two e=new two();
		e.print_geek();
		e.print_for();
		e.print_geek();
		

	}

}
