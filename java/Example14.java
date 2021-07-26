package com.ust.examples;

public class Example14 {
	
	int id;
	String name;
	float Salary;
	void insert(int i,String j,float k) {
		
	id=i;
	
	name=j;
	
	Salary=k;
	
	
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+Salary);
	}

	public static void main(String[] args) {
		
		Example14 e1 =new Example14();
		Example14 e2 =new Example14();
		Example14 e3 =new Example14();
		Example14 e4 =new Example14();
		Example14 e5 =new Example14();
		
		e1.insert(10, "alona",20000);
		e2.insert(11, "arya", 25000);
		e3.insert(12, "akhila",30000);
		e4.insert(13, "sarmada",23000);
		e5.insert(12, "arya a",28000);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
		

	}

}
