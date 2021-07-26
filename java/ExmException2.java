package com.ust.examples;

import java.io.*;

public class ExmException2 {
	
	public static void findFile() throws IOException {

	   
	    File newFile = new File("C:\\\\Users\\\\ustjava24\\test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }


	public static void main(String[] args) {
		try {
		      findFile();
		    }
		    catch (IOException e) {
		      System.out.println(e);
		    }


	}

}
