package com.ust.examples;
interface Polygon {
	  void getArea(int length, int breadth);
	 
	}

	
	class Rectangle implements Polygon {

	
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }
	}
	class Square implements Polygon {

		
		  public void getArea(int length, int breadth) {
		    System.out.println("The area of the square is " + ((length * breadth)));
		  }
		  
		  
		  
		}


public class ExmInterface5 {

	public static void main(String[] args) {
		 Rectangle r1 = new Rectangle();
		 Square t1=new Square();
		 r1.getArea(5, 6);
		 t1.getArea(10, 10);

	}

}
