package com.ust.examples;

abstract class Person{
	abstract void  eat();
}

public class Example55 {

	public static void main(String[] args) {
		
		Person p1=new Person() {

		
			void eat() {
				System.out.println("nice fruits");
				}  

		};
		p1.eat();

	}

}
