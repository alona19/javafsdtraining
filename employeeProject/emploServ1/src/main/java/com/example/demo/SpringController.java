package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/employees")
public class SpringController {



@Autowired
EmpRespository emprepo;

@GetMapping("/employee")

public Empp getDetails() {
	
	List<Emp> details = new ArrayList<>();

	details=(List<Emp>) emprepo.findAll();
	Empp emplist=new Empp(details);
	
	return emplist;
	
}

	
}
