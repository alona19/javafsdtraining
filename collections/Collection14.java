package com.ust.examples;
class GenericsClass<T> {

	 
	  private T data;

	  public GenericsClass(T data) {
	    this.data = data;
	  }

	 
	  public T getData() {
	    return this.data;
	  }
	}

public class Collection14 {

	public static void main(String[] args) {
		GenericsClass<Integer> intObj = new GenericsClass<Integer>(5);
	    System.out.println("Generic Class returns: " + intObj.getData());

	    
	    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
	    System.out.println("Generic Class returns: " + stringObj.getData());


	}

}
