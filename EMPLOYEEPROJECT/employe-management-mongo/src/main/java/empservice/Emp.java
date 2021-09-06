package empservice;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cov")
public class Emp {
@org.springframework.data.annotation.Id
	
	private String id;
	
	private String firstName;
	
	private String lastName;

	private String email;
	
	private String Department;

	
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
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	

}
