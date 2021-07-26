package com.ust.examples;

import java.io.File;
import java.io.IOException;

public class ExmFile5 {

	public static void main(String[] args) {
		
		
		try {
			File f2=new File("C:\\Users\\ustjava24\\oldname");
			f2.createNewFile();
			File f3=new File("C:\\Users\\ustjava24\\new1name");
			boolean value=f2.renameTo(f3);
			if(value) {
				System.out.println("renamed");	
			}
			else {
				System.out.println("not renamed");
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
