package com.ust.examples;
class GenericsClasss <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

public class Collection16 {

	public static void main(String[] args) {
		GenericsClasss<Float> obj = new GenericsClasss<>();
		obj.display();

	}

}
