package com.ust.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExmFile7 {

	public static void main(String[] args) {
		FileWriter filewriter=null;
		BufferedWriter bufferedwriter=null;
		try {
			filewriter=new FileWriter("C:\\Users\\ustjava24\\file");
			bufferedwriter=new BufferedWriter(filewriter);
			bufferedwriter.write("this is an example \n");
			bufferedwriter.write("of buffered writer \n");
			bufferedwriter.write("and of buffered reader");
			bufferedwriter.flush();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
				try {
					if ((filewriter != null)&&(bufferedwriter!=null)) {
					filewriter.close();
					bufferedwriter.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
				
			FileReader filereader=null;
			BufferedReader bufferedreader=null;
			try {
					filereader=new FileReader("C:\\Users\\ustjava24\\file");
					bufferedreader=new BufferedReader(filereader);
					
					String line=null;
					
					while((line=bufferedreader.readLine()) != null) {
						System.out.println(line);
				}
					
					
			} catch (Exception e) {
					
					e.printStackTrace();
			}
				finally {
					try {
					if ((filereader != null)&&(bufferedreader!=null)) {
						filewriter.close();
						bufferedwriter.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				
			
		}
		

	}


