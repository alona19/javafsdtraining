package com.ust.examples;


class calculation{
	int z;
	
	public  void addition(int x,int y)
	{
		z=x+y;
		System.out.println("addition"+z);
		
		
		
	}
	public  void subtraction(int a,int b)
	{
		z=a-b;
		System.out.println("subtraction"+z);
	}	
}




class Example32 extends calculation{
	
	
	public  void multiplication(int a,int b)
	{
		z=a-b;
		System.out.println("subtraction"+z);
	}	

  public static void main(String[] args) {
		
		
	  Example32 m=new Example32();
		
	
		
		m.multiplication(4,5);
		m.subtraction(10,4);
		m.addition(21,144);
	

}

}


	