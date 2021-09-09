package com.ust.springboot;

import java.util.List;

public interface CovService {
	List <Covid> getEmployees();

	void saveEmployee(Covid employee);
	Covid getEmployeeById(String id);
	void deleteEmployeeById(String id);
	

}
