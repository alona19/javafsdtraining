package com.ust.examples;


class anm{
	
	String name;
	
	public void eat() {
		System.out.println("i can eat");
	}
}

class dogss extends anm{
	public void display() {
		System.out.println("name"+ name);
	}
	
}

public class Example29 {

	public static void main(String[] args) {
		dogss dash=new dogss();
		dash.name=":lab";
		dash.eat();
		dash.display();

	}

}
