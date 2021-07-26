package com.ust.examples;

import java.io.File;
import java.io.IOException;

public class Example11 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ustjava24file1.txt");
		
		try{if(f.createNewFile()) {
			System.out.println("new file is created");
		}
		else {
			System.out.println("new file is not created");
		}}catch(IOException e){System.out.println(e);}

	}

}


