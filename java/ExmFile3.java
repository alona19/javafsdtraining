package com.ust.examples;
import java.io.FileOutputStream;

public class ExmFile3 {

	public static void main(String[] args) {
		try {
			/*FileInputStream input=new FileInputStream("C:\\Users\\ustjava24\\test11.txt");
			int i=input.read();
			while(i!=-1) {
				System.out.print((char)i);
				 i=input.read();
			}*///
			//input.close();
			
		String s="output file";
		
			FileOutputStream output=new FileOutputStream("C:\\Users\\ustjava24\\test11.txt");
			
			output.write(s.getBytes());
			output.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
