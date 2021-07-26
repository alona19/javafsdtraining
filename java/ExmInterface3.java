package com.ust.examples;

class Students{
	int roll;
	void getData(int p) {
		roll=p;
	}
	void display() {
		System.out.println("Roll number is "+roll);
	}
}

class Test1 extends Students{
	double p1,p2;
	void putMarks(double x,double y) {
		p1=x;
		this.p2=y;
		
	}
	void showMarks() {
		System.out.println("test1 = "+p1);
		System.out.println("test1 = "+p2);
	}
}

interface sports{
	double weight=50.0;
	void showWeight();
}

class Results extends Test1 implements sports{

	double total;
	public void showWeight() {
		
		System.out.println("Weight "+weight);
	}
	void displayAll() {
		total =p1+p2+weight;
		display();
		showMarks();
		showWeight();
		System.out.println("total = "+total);
		
	}
	
}
public class ExmInterface3 {

	public static void main(String[] args) {
		Results r1=new Results();
		r1.getData(10);
		r1.p1=12.5;
		r1.p2=25.5;
		r1.displayAll();

	}

}
