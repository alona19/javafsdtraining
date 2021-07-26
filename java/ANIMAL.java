package com.ust.examples;

abstract class animal2{
	
	abstract void animal_sound();
	
}


class DOGS extends animal2{
	void animal_sound() {
		System.out.println("dogs bark");
		
	}
}

class CATS extends animal2{
	void animal_sound() {
		System.out.println("cats meows");
		
	}
}

public class ANIMAL {

	public static void main(String[] args) {
		DOGS d1=new DOGS();
		d1.animal_sound();
		CATS c1=new CATS();
		c1.animal_sound();
		animal2 e1=new CATS();
		e1.animal_sound();
		
		
	}

}
