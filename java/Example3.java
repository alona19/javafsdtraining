package com.ust.examples;
/*
 * 
 * example of for loop
 */


public class Example3 {

	public static void main(String[] args) {
		
		//String[] str =new String[5];
		
		String[] str= {"alona","sarmada","arya","hari","anjali"};
		
		/*for(int i=0;i<str.length;i++) {
			
			if(str[i].equals("hari"))
			//break;
				continue;
			System.out.println(str[i]);
		}*/
		int i=0;
		
		/*while(i<str.length) {
			
			if(str[i].equals("hari"))
				break;
			
			System.out.println(str[i]);
			i++;
			
		}*/
		
		
		do {
			if(str[i].equals("hari"))
				break;
			
			System.out.println(str[i]);
			i++;
		} while(i<str.length);
			
		}
		
		
		
	}


