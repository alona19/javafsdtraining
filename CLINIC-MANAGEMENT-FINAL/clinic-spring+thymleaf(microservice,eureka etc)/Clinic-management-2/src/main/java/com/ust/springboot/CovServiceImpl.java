package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovServiceImpl implements CovService {
    @Autowired
    CovRespository covrepo;
	@Override
	public List<Covid> getEmployees() {
		
		return covrepo.findAll();
	}

	@Override
	public void saveEmployee(Covid employee) {
		// TODO Auto-generated method stub
		this.covrepo.save(employee);
		
	}

	public Covid getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Optional<Covid> optional = covrepo.findById(id);
		Covid employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		this.covrepo.deleteById(id);
		
	}
	

}
