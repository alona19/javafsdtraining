package com.ust.examples;

class A{
	
	public void print_A(){
		
		System.out.print("class A ");
		
	}
}
class B extends A{
	
	public void print_B(){
		
		System.out.print("class B ");
		
	}
}
class C extends A{
	
	public void print_C(){
		
		System.out.print("class C ");
		
	}
}

class D extends A{
	
	public void print_D(){
		
		System.out.print("class D ");
		
	}
}

public class Example31 {

	public static void main(String[] args) {
		
		B b=new B();
		b.print_A();
		b.print_B();
		
		C c=new C();
		c.print_A();
		c.print_C();
		
		D d=new D();
		d.print_A();
		d.print_D();
		
		
		
		
	}

}
