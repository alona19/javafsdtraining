package com.ust.examples;
/*
 * Exception example
 * 
 */

public class ExmException {

	
	public static void main(String[] args) {
		String s =null;
		
		//int x=5/0;
		
		try {
			try {
				
				System.out.println(s.length());
			}catch(NullPointerException e) {
				
				e.printStackTrace();
			}
			finally {
				System.out.println("this code will run");
			}
			int a[]=new int[5];
			a[6]=10;
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
			System.out.println("Exception occurs");
		}

	}

}
