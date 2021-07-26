package com.ust.examples;

import java.util.Scanner;

public class Example39 {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		original =sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
System.out.println("the reverse string is"+"\n"+reverse);
	}

}
