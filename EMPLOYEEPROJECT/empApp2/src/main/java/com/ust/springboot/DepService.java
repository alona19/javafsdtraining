package com.ust.springboot;

import java.util.List;

public interface DepService {
	List <Dep> getEmployees();

	void saveEmployee(Dep employee);
	Dep getEmployeeById(String id);
	void deleteEmployeeById(String id);
	

}
