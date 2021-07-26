package com.ust.examples;
class patient{
	private String name;
	private int age;
	private boolean vaccinestatus;
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
	public boolean isVaccinestatus() {
		return vaccinestatus;
	}
	public void setVaccinestatus(boolean vaccinestatus) {
		this.vaccinestatus = vaccinestatus;
		
		if(vaccinestatus==true) {
			System.out.println("Congrats!! Done a good job");
		}
		else {
			System.out.println("please got vaccinates ASAP!!");
		}
	}
	
	
}
public class ExampleEncaspu2 {

	public static void main(String[] args) {
		patient p=new patient();
		
		p.setName("alona");
		p.setAge(23);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.isVaccinestatus());
		p.setVaccinestatus(false);
		

	}

}
