package com.ust.examples;

public class Example15 {

	public static void main(String[] args) {
		int array[]= {1,25,18,12,8,17,9};
		
		
		int sum=0;
		double average;
		
		for(int i:array) {
			//System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum =" + sum);
		
		average=((double)sum/(double)array.length);
		
		System.out.println("average ="+ average);
		
		

	}

}
