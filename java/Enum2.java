package com.ust.examples;

public class Enum2 {
	enum Level1{
		LOW,MEDIUM,HIGH;
	}

	public static void main(String[] args) {
		System.out.println(Level1.values());
		for(Level1 e:Level1.values()) {
			System.out.println(e.name());
		}

	}

}
