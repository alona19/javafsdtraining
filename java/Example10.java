package com.ust.examples;

public class Example10 {
public static void displayArray(int a[]) {
	
	for(int i:a) {
		
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		int array[]=new int[4];
		
		array[0]=1;
		array[1]=5;
		array[2]=7;
		array[3]=12;
		
		
		
		/*for(int i:array) {
			
			System.out.println(i);
		}*/
		
		
	//for(int i=0;i<array.length;i++) {
		/*for(int i:array) {
			
			System.out.println(i);
		}*/
		
		displayArray(new int[] {1,5,70,80});
		
	}

}
