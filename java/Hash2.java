package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hash2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhash1=new LinkedHashMap<Integer,String>();
		
		lhash1.put( 1,"one");
		lhash1.put( 3,"three");
		lhash1.put( 7,"seven");
		lhash1.put( 2,"two");
		
		for(Map.Entry<Integer,String> l:lhash1.entrySet()){
			
			Integer key=l.getKey();
			String value=l.getValue();
			System.out.println(key+":"+value);
			
		}

	}

}
