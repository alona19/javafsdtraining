package com.ust.examples;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExmFile2 {

	public static void main(String[] args) {
		
		
		File f1=new File("C:\\Users\\ustjava24\\test11.txt");
		
		try {
			//FileWriter f1=new FileWriter("C:\\\\Users\\\\ustjava24\\\\test1.txt");
			
			//f1.write("this is a file");
			if(f1.createNewFile()) {
				
				System.out.println("file created");
				
			}
			else {
				System.out.println("already exists");
			}
			//f1.close();
			if(f1.canRead()) {
				System.out.println("can read");
			}
			else {
				System.out.println("can't read");
			}
			
			System.out.println(f1.canWrite());
			
			System.err.println("err");
			
			Scanner s=new Scanner(System.in);
			
			
			
			String txt=s.nextLine();
			
			
			System.out.println(txt);
			
			
			System.out.println(f1.canRead());
			
			
			
			//System.out.println(f1.canWrite());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
