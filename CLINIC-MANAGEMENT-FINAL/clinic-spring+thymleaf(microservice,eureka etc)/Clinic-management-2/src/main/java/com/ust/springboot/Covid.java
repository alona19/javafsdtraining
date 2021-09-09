package com.ust.springboot;



import org.springframework.data.mongodb.core.mapping.Document;



public class Covid {
	@org.springframework.data.annotation.Id
	
	private String id;
	
	private String firstName;
	
	private String lastName;

	private String email;
	private int vaccineCount;
	
	private String Hospital;

	

	public int getVaccineCount() {
		return vaccineCount;
	}
	public void setVaccineCount(int vaccineCount) {
		this.vaccineCount = vaccineCount;
	}
	

	public String getHospital() {
		return Hospital;
	}
	public void setHospital(String hospital) {
		Hospital = hospital;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
