package com.ust.examples;

public class BankException extends Exception {
	static String msg="error";
	
	BankException(String message){
		super(message);	
	}
	
	

	public static void main(String[] args) throws BankException {
		if(msg.equals("error")) {
			
			System.out.println("error message");
			
		}
		else 
			
			throw new BankException("BankException");
		
		
		

	}

}
