package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class collection1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(2);
		ar.add("hi");
		ar.add(4.2);
		System.out.println(ar);
		ar.add(2, "alona");
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		
		ArrayList<Integer>x =new ArrayList<Integer>();
		x.add(0);
		x.add(10);
		x.add(4);
		x.add(2);
		Collections.sort(x);
		int y=4;
		System.out.println(x);
		
		for(int i=0;i<x.size();i++) {
			if(x.get(i)==y) {
				System.out.println("The value exits");
				
				System.out.println("index is "+ i);
				x.set(i,7);
				
			}
			
		}
		System.out.println(x);
		
		

	}

}
