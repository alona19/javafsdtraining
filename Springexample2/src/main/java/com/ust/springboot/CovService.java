package com.ust.springboot;

import java.util.List;

public interface CovService {
	List <Cov> getEmployees();

	void saveEmployee(Cov employee);
	Cov getEmployeeById(String id);
	void deleteEmployeeById(String id);
	

}
