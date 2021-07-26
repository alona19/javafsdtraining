package com.ust.examples;
/*
 * Encaspulation
 */

class TestData{
	
	private String name;
	private int age;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
public class ExampleEncaspu {

	public static void main(String[] args) {
		TestData t =new TestData();
		t.setName("alona");
		t.setAge(23);
		t.setSalary(25000.14f);
		
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(t.getSalary());

	}

}
