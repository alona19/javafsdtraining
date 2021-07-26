package com.ust.examples;

import java.io.File;

public class ExmFile6 {

	public static void main(String[] args) {
		File f3=new File("C:\\Users\\ustjava24");
		
		String[] fileList=f3.list();
		for(String str:fileList) {
			
			System.out.println(str);
			
		}
		

	}

}
