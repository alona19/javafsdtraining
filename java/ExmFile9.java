package com.ust.examples;

import java.io.IOException;
import java.io.StringReader;

public class ExmFile9 {

	public static void main(String[] args) {
		String s="Hello world!! /n this is an string reader example";
		StringReader s1=new StringReader(s);
		
		try {
			int i;
			while((i=s1.read())!=-1) {
				
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
