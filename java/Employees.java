package com.ust.examples;

  abstract class Emplo{
	  
	private String name;
	private int Emplohour;
	
	void display() {
		 System.out.println("name is "+name+"\n"+"Employee hour is "+Emplohour);
	 }
	
	 Emplo() {
		
	}
	
	 Emplo(String name,int Emplohour) {
		this.name=name;
		this.Emplohour=Emplohour;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setEmploHour(int Emplohour) {
		this.Emplohour=Emplohour;
	}
	
	public int getEmploHour() {
		return Emplohour;
	}
	abstract void salary(int x,int y);	
	
}
public  class Employees extends Emplo{
	
	Employees(){
		super();
	}
	 
	 Employees(String name,int Emplohour ){
		super(name,Emplohour);
		 
	 }
	 
	 void salary(int days,int total_sal) {
		 if((total_sal/days)>500) {
			 System.out.println("The Pay is Good");
		 }
		 
		 else {
			 System.out.println("The Pay is not Good");
		 }
		 
	 }
	 
	 public static void main(String[] args) {
			
			
		 Employees e1=new Employees("alona",18);
		 e1.display();
		 Employees e2=new Employees();
		 e2.setname("alina");
		 System.out.println(e2.getname());
		 e2.salary(10,10000);
		 

		}

	 
 }

 