package com.ust.examples;



class creditCards{
	private String cardname;
	private String expirydate;
	private float creditBalance;
	creditCards(){
		
	}
	
	creditCards(String cardname,String expirydate,float creditBalance ){
		
		this.cardname=cardname;
		this.expirydate=expirydate;
		this.creditBalance=creditBalance;
	}
	
	void checkBalance() {
		
		if(creditBalance>40000) {
			System.out.println("sufficent balance");
		}
		
		else {
			System.out.println("not sufficent balance");
		}
		
	}

	
}
class visa extends creditCards{
	float interestRate;
	int creditLimit;
	
	visa(){
		super();
	}
	visa(String cardname,String expirydate,float creditBalance,int creditLimit){
		super(cardname,expirydate,creditBalance);
		
		this.creditLimit=creditLimit;
		
		
		
	}
	
	
	
	void discounts() {
	System.out.println("many discounts will be provided");
	}
	
	
}
class mastercard extends creditCards{
	
	void discounts() {
	System.out.println("online payment mode provided");
	}
	
	
}

public class Example28 {

	public static void main(String[] args) {
		//visa e1=new visa("visa","alona",15);
		
		
		visa e1=new visa();
		//e1.cardname="visa card";
		//e1.expirydate="12/10/2022";
		//e1.interestRate=4.15f;
		e1.checkBalance();
		System.out.println(e1.interestRate+"\n");
		
		

	}

}
