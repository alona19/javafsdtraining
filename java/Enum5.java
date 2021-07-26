package com.ust.examples;

enum Direction1{
	  EAST ("E"), 
	  WEST ("W"), 
	  NORTH ("N"), 
	  SOUTH ("S")
	 ;
	
	  private final String shortCode;
		  
	  Direction1(String code) {
	      this.shortCode = code;
	  }
		  
	  public String getDirectionCode() {
	      return this.shortCode;
	  }

}

public class Enum5 {

	public static void main(String[] args) {
		Direction1 dir = Direction1.SOUTH;
    	System.out.println(dir.getDirectionCode());
    	Direction1 dir2 = Direction1.EAST;
    	System.out.println(dir2.getDirectionCode());


	}

}
