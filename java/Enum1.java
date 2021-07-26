package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enum1 {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		
		
		Hashtable <String,String> hashtable=new Hashtable <String,String>();
		hashtable.put("key1", "alona");
		hashtable.put("key2", "arya");
		hashtable.put("key3", "akila");
		hashtable.put("key4", "sarmats");
		
		names=hashtable.keys();
		
		
		while(names.hasMoreElements()) {
			
			key=(String)names.nextElement();
			
			System.out.println("key "+key+" & value "+hashtable.get(key));
		}
		
		
		
	}

}
