package com.ust.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection13 {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		
		tree.add(" apple");
		tree.add(" strawberry");
		tree.add(" banana");
		tree.add(" orange");
		
		
		System.out.print(tree+"\n");
		
		
		Iterator<String> itr=tree.iterator();
		while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}

}
