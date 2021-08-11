package com.ust.controller;



public class Medicine {
	
	int mid;
	String mname;
	double price;
	int qty;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Medicine(int mid, String mname, double price, int qty) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
		this.qty = qty;
	}
	
	public Medicine() {
		super();
	}
	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname + ", price=" + price
				+ ", qty=" + qty + "]";
	}
	
	

}
