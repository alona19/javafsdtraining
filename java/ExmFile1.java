package com.ust.examples;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
public class ExmFile1 {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\Users\\ustjava24\\filename1.txt");
			try (FileReader read = new FileReader(f)) {
				int ch;
				while((ch=read.read()) != -1){
				System.out.print((char)ch);
				}
			}
			} catch (IOException e) {
				System.out.println("Exception occured");
				//e.printStackTrace();
			}
	}

}
