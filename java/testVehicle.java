package com.ust.examples;
/*
 * 
 * abstract example
 */

abstract class Vehicle{
	int x=5;
	
	Vehicle(){
		System.out.println("vehicle class constructor");
	}
	
	abstract void run();
	
	void changeGear() {
		
		System.out.println("this will chnage the gear");
		
	}
}
	class Honda extends Vehicle{
		
		void run() {
			System.out.println("running fine");
		}
		
		void changeGear() {
			
			System.out.println("this will chnage the gear.okay!!!");
			super.changeGear();
		}
		
	}
	

 public class testVehicle {

	public static void main(String[] args) {
		Vehicle V=new Honda();
		System.out.println(V.x);
		V.run();
		V.changeGear();
		
	
	

	}

}
