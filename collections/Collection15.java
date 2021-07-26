package com.ust.examples;
class DemoClasss {

	  
	  public <T> void genericsMethod(T data) {
	    System.out.println("Generics Method:");
	    System.out.println("Data Passed: " + data);
	  }
}
public class Collection15 {

	public static void main(String[] args) {
		DemoClasss demo=new DemoClasss();
		demo.genericsMethod("hai");
		

	}

}
