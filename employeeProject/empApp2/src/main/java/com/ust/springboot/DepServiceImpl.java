package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepServiceImpl implements DepService {
    @Autowired
    DepRespository emprepo;
	@Override
	public List<Dep> getEmployees() {
		
		return emprepo.findAll();
	}

	@Override
	public void saveEmployee(Dep employee) {
		// TODO Auto-generated method stub
		this.emprepo.save(employee);
		
	}

	public Dep getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Optional<Dep> optional = emprepo.findById(id);
		Dep employee = null;
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
