package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovServiceImpl implements CovService {
    @Autowired
    CovRespository emprepo;
	@Override
	public List<Cov> getEmployees() {
		
		return emprepo.findAll();
	}

	@Override
	public void saveEmployee(Cov employee) {
		// TODO Auto-generated method stub
		this.emprepo.save(employee);
		
	}

	public Cov getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Optional<Cov> optional = emprepo.findById(id);
		Cov employee = null;
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
		this.emprepo.deleteById(id);
		
	}
	

}
