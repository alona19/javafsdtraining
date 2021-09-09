package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/Covid")
public class SpringController {



@Autowired
CovidRespository covrepo;
@GetMapping("/details")

public Coovid getDetails() {
	
	List<Covid> details = new ArrayList<>();

	details=covrepo.findAll();
	Coovid vaccinelist=new Coovid(details);
	
	return vaccinelist;
	
}

	
}
