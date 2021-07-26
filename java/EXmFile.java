package com.ust.examples;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class EXmFile {

	public static void main(String[] args) {
		
		try {
			File f=new File("filenamze1.txt");
			//FileWriter f=new FileWriter("filename1.txt");
			if(f.createNewFile()) {
				System.out.println(f.getName()+" is created");
			}
			else {
				System.out.println("already exists");
			}
			//FileReader read=new FileReader(f);
			
			
				/*int ch;
				while((ch=read.read())!= -1){
				System.out.println((char)ch);
				}*/

			/*Scanner read=new Scanner(f);
			while(read.hasNextLine()) {
				String data=read.nextLine();
				System.out.println(data);
			}*/
			//f.write("this is afile1");
			//f.close();
			//read.close();
			
		} catch (IOException e) {
			System.out.println("Exception occured");
			//e.printStackTrace();
		}

	}

}
