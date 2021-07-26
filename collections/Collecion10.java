package com.ust.examples;
import java.util.*;

public class Collecion10 {

	public static void main(String[] args) {
		HashSet<String> hash=new HashSet<String>();
		
		hash.add(" This");
		hash.add(" is an");
		hash.add(" example of");
		hash.add(" hashset");
		hash.add(null);
		System.out.print(hash+"\n");
		
		
		Iterator<String> itr=hash.iterator();
		while (itr.hasNext()) {
            System.out.println(itr.next());
        }

		
	}

}
