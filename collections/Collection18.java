package com.ust.examples;

import java.util.ArrayList;
import java.util.List;

public class Collection18 {
		public static double sum(List<? extends Number> list){ 
		double sum = 0; 
		for(Number n : list){
			sum += n.doubleValue(); }
		return sum; 
	

			}


	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>(); 
		ints.add(3); 
		ints.add(7); 
		ints.add(10); 
		ints.add(13); 
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
		
		
		
	}
}
