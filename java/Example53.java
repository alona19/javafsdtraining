package com.ust.examples;

interface Emp
{
int eid1 = 2101;
void geteid();
}
class Implclass implements Emp
{

public void geteid()
{

System.out.print("Employee id is "+eid1);
}
}



public class Example53 {

	public static void main(String[] args) {
		Implclass ob=new Implclass();
		
		ob.geteid();


	}

}
