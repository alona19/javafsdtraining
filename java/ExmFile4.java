package com.ust.examples;


import java.io.FileReader;

public class ExmFile4 {
	

	public static void main(String[] args) {
		char array[]=new char[100];
		try {
			FileReader r1=new FileReader("C:\\\\Users\\\\ustjava24\\\\test11.txt");
			
			r1.read(array);
			System.out.println(array);
			r1.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
