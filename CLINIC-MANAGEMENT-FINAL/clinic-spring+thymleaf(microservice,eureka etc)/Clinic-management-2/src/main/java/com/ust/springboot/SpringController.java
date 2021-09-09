package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
@Autowired
CovService covservice;
@RequestMapping("/")
public String index() {
	return "aboutus.html";
	
}
@RequestMapping("/aboutus")
public String about() {
	return "aboutus.html";
	
}
@RequestMapping("/contact")
public String contact() {
	return "contact.html";
	
}
@GetMapping("/home")
public String viewhomepage(Model model) {
	model.addAttribute("listEmployees",covservice.getEmployees());
	return "home";
	
	
}
@GetMapping("/enquiryForm")
public String showemployeeform(Model model) {
	Covid cov=new Covid();
	model.addAttribute("employee",cov);
	return "enquiryForm";
	
}
@PostMapping("/save")
public String saveEmployee(@ModelAttribute("employee") Covid cov) {
	covservice.saveEmployee(cov);
	return "redirect:/";
	
}
@GetMapping("/showFormForUpdate/{id}")	
public String showform(@PathVariable (value="id") String id, Model model ) {
	
	Covid cov= covservice.getEmployeeById(id);
	model.addAttribute("employee",cov);
	return "updateform";
	
	
}
@GetMapping("/deleteEmployee/{id}")	
public String deleteform(@PathVariable (value="id") String id ) {
	
	this.covservice.deleteEmployeeById(id);
	
	return "redirect:/";
	
	
}	

	
}
