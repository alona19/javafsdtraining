package com.ust.examples;
interface Empl
{
int eid = 2101;

void geteid();

}


public class Example54 {

	public static void main(String[] args) {
		
		Empl ob = new Empl() {
		
		public void geteid() {
		
		System.out.print("Employee id is "+eid);
		}
		};
		
		ob.geteid();

		

	}

}
