package com.ust.controller;



public class Patient {
	
	int pid;
	String pname;
	int age;
	String gender , address;
	long phoneno;
	
	
	
	public Patient() {
		super();
	}
	public Patient(int pid, String pname, int age, String gender,
			String address, long phoneno) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneno = phoneno;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phoneno="
				+ phoneno + "]";
	}
	
	
}

	
	
