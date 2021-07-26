package com.ust.examples;

public class Example23 {
	
String web;

Example23 (String w){
	web =w;
}

Example23(Example23 cc){
	
	web=cc.web;
	
}

void display() {
	System.out.println("Constructor::"+web);
}
	public static void main(String[] args) {
		
		
		Example23 e1=new Example23("alona");
		Example23 e2=new Example23(e1);
		
		e1.display();
		e2.display();
		
	}

}
