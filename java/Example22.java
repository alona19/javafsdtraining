package com.ust.examples;

public class Example22 {
	
	String fName;
	String lName;
	String city;
	String adress;
	String dob;
	float salary;
	static int i;
	static String b;
	Example22(String x,String y,String z,String a,String b,Float c ){
		
		fName=x;
		lName=y;
		city=z;
		adress=a;
		dob=b;
		salary=c;
		
		
		
	}
	
	void  display(){
		System.out.println( fName+" "+lName+" "+city+" "+adress+" "+dob+" "+salary);
		
		
	}

	public static void main(String[] args) {
		//Example22 e1=new Example22("alona","george","katta","ghs","16/2/12",2800.0f);
		//Example22 e2=new Example22("adona","george","katta","ghsf","16/10/12",28000.0f);
		//Example22 e3=new Example22("happy","george","katta","ghscc","16/11/12",12800.0f);
		//Example22 e4=new Example22("rose","george","katta","gxxhs","25/2/12",28880.0f);
		//Example22 e5=new Example22("george","joseph","katta","ghhhs","10/2/12",4800.0f);
		
		Example22 array[]=new Example22[5];
		array[0]=new Example22("alona","george","katta","ghs","16/2/12",2800.0f);
		array[1]=new Example22("adona","george","katta","ghsf","16/10/12",28000.0f);
		array[2]=new Example22("happy","george","katta","ghscc","16/11/12",12800.0f);
		array[3]=new Example22("rose","george","katta","gxxhs","25/2/12",28880.0f);
		array[4]=new Example22("george","joseph","katta","ghhhs","10/2/12",4800.0f);
		
		for(int i =0; i<array.length;i++) {
			
			
			array[i].display();
		}
		
		
		
		
		
		/*for(Example22 e:array) {
			//System.out.println(e.fName+e.lName+e.city+e.adress+e.dob+e.salary);
			e.display();
		}*/
		
		
		
		
		
		
		
		
			/*for ( i=1;i<=5;i++) {
				b="e+i";
			b.display();
		}*/
		
		/*e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();*/
		
		

	}

}
