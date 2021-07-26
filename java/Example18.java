package com.ust.examples;

public class Example18 {

	public static void main(String[] args) {
		int array[]= {12,1,7,19,87,20};
		
		int sum=0;
				
		double average;
		for(int i =0;i<array.length;i++) {
			
			sum+=array[i];			
		}
		
		System.out.println(sum);
		
		average=((double)sum+(double)array.length);
		
		System.out.println(average);
		

	}

}
