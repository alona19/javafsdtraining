package com.ust.examples;

public class Example5 {

	public static void main(String[] args) {
		int[] marks= {50,25,21,12,54};
		int i=0;
		
		while(i < marks.length) {
			
			if(marks[i] >= 25) {
				System.out.println(marks[i]);
				System.out.println("passed");
				
				
			}
			else {
				System.out.println(marks[i]);
				System.out.println("failed");
			}
			i++;
		}

	}

}
