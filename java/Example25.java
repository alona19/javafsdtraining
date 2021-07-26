package com.ust.examples;


class example{
	
	
	int a=9;
	int b=18;
	void m1() {
		a=10;
		b=20;
	}
	
	
}

class test{
	static void m1(example[] e) {
		e[0].m1();
	}
}
public class Example25 {

	public static void main(String[] args) {
		example[] ex = {new example(),new example(),new example()};
		test.m1(ex);
		for(int i=0;i<ex.length;i++) {
			System.out.println(ex[i].a+"\t");
			System.out.println(ex[i].b+"\n");
			
			
		}

	}

}
