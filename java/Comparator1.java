package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{
	int id;
	String name;
	int age;
	Student2(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	
	
}
class NameComparator implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Student2 s1=(Student2)obj1;
		Student2 s2=(Student2)obj2;
		return s1.name.compareTo(s2.name);
		
		
	}
}

class AgeComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Student2 s1=(Student2)obj1;
		Student2 s2=(Student2)obj2;
		if(s1.age==s2.age) {
			return 0;
		}
		else if(s1.age >s2.age) {
			return 1;
		}
		else 
			return -1;
		
		
	}
}

public class Comparator1 {

	public static void main(String[] args) {
		
		
		
		ArrayList arr=new ArrayList();
		
		arr.add(new Student2(1,"fourth",10));
		arr.add(new Student2(2,"first",9));
		arr.add(new Student2(3,"Third",21));
		
		System.out.println("SORTING BY NAME");
		Collections.sort(arr,new AgeComparator());
		
		Iterator itr=arr.iterator();
		
		
		while(itr.hasNext()) {
			Student2 st=(Student2)itr.next();
			System.out.println(st.id +" "+st.name+" "+st.age);
		}
		
		


		

	}

}
