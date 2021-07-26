package com.ust.examples;

interface Animal3 {
	  public void animalSound();
		    
	  public void sleep();
	}

	
	class Pig implements Animal3 {
	  public void animalSound() {
	    
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	   
	    System.out.println("Zzz");
	  }
	}


public class ExmInterface1 {

	public static void main(String[] args) {
	    Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();


	}

}
