package com.example.demo;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="covid")
public class Covid {
@org.springframework.data.annotation.Id
	
	private String id;
	
	private String firstName;
	
	private String lastName;

	private String email;
	
	private String vaccineCount;
	
	private String Hospital;
	

	
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
	
	
	public String getHospital() {
		return Hospital;
	}
	public void setHospital(String hospital) {
		Hospital = hospital;
	}
	public String getVaccineCount() {
		return vaccineCount;
	}
	public void setVaccineCount(String vaccineCount) {
		this.vaccineCount = vaccineCount;
	}


}
