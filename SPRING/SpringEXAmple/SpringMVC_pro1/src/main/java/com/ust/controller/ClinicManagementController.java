package com.ust.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@ComponentScan
public class ClinicManagementController {
@Autowired
PatientDao pdao;
@Autowired
MedicineDao mdao;
@Autowired
UserDao udao;

//login

//@GetMapping("/hello")

 @RequestMapping(value="/login",method=RequestMethod.GET)
public ModelAndView getLogin(){
ModelAndView model2=new ModelAndView("login");
model2.addObject("login", "enter details");
System.out.println("hello");
return model2;
}

/*@RequestMapping(value="/login",method = RequestMethod.GET )
public String showform(Model m){
	m.addAttribute("command",new UserDetails());
	return "login";
}
@RequestMapping("/login")
public ModelAndView display() {
	ModelAndView view =new ModelAndView("login");
	return view;
}*/





@RequestMapping(value="/login",method=RequestMethod.POST)
public ModelAndView submit(@RequestParam("user_id")int user_id,@RequestParam("password")String password){
String role=udao.validate(user_id, password);
if(role.equals("Admin")){
	System.out.println("helo");
	
ModelAndView model=new ModelAndView("AdminLogin");
return model;
}
if(role.equals("Front")){
ModelAndView model=new ModelAndView("FrontLogin");
return model;

}
if(role.equals("Pharmacy")){
ModelAndView model=new ModelAndView("PharmacyLogin");
return model;
}
else{
ModelAndView model=new ModelAndView("GuestLogin");
return model;
}



}


//Patient
@RequestMapping(value="/selectAllPat",method=RequestMethod.GET)

public String showPatient(Model m1){

List<Patient>list=pdao.findAll();
m1.addAttribute("listOfpatient",list);
return "viewpat";
}

//insert into patient
@RequestMapping(value="/insertpat", method=RequestMethod.GET)
public  ModelAndView insertPatient()
{
ModelAndView model=new ModelAndView("insertpat");
return model;

}

//inserting patient details
@RequestMapping(value="/insert", method={RequestMethod.POST,RequestMethod.GET})
public  ModelAndView PatientSuccess(@RequestParam("pid")int pid,
@RequestParam("pname")String pname,
@RequestParam("age")int age,
@RequestParam("gender")String gender,
@RequestParam("address")String address,
@RequestParam("phoneno")long phoneno)
{
Patient pat=new Patient(pid, pname,age,gender, address,phoneno);
pdao.insert(pat);

ModelAndView model=new ModelAndView("Success");
model.addObject("patient", pat);
return model;

}

//edit patient
@RequestMapping(value="/editpat/{id}")
public String edit(@PathVariable int id,Model m){

Patient pt=pdao.findById(id);
m.addAttribute("command",pt);
return "editpat";

}

@RequestMapping(value="/editsave",method=RequestMethod.POST)
public String editsave(@ModelAttribute("pat")Patient pat){
pdao.update(pat);
return "redirect:/selectAllPat";
}

//delete
@RequestMapping(value="/deletepat/{id}",method=RequestMethod.GET)
public String delete(@PathVariable int id){
pdao.delete(id);
return "redirect:/selectAllPat";
}

@ResponseBody
@RequestMapping(value="/find/{id}",method=RequestMethod.GET,produces="application/json")
public Patient find(@PathVariable("id")int pid){

return pdao.findById(pid);
}



//Medicine
@RequestMapping(value="/selectAllMed",method=RequestMethod.GET)

public String showMed(Model m2){

List<Medicine>list=mdao.findAll();
m2.addAttribute("listOfmedcine",list);
return "viewmed";
}

//insert into medicine
@RequestMapping(value="/insertmed", method=RequestMethod.GET)
public  ModelAndView insertMed()
{
ModelAndView model=new ModelAndView("insertmed");
return model;

}

//inserting medicine details
@RequestMapping(value="/insert", method={RequestMethod.POST,RequestMethod.GET})
public  ModelAndView MedicineSuccess(@RequestParam("mid")int mid,
@RequestParam("mname")String mname,
@RequestParam("price")Double price,
@RequestParam("qty")int qty)


{
Medicine med=new Medicine(mid, mname, price,qty);
mdao.insert(med);

ModelAndView model=new ModelAndView("Success");
model.addObject("medicine", med);
return model;

}

//edit medicine
@RequestMapping(value="/editmed/{id}")
public String editMed(@PathVariable int id,Model m){

Medicine md=mdao.findById(id);
m.addAttribute("command",md);
return "editmed";

}

@RequestMapping(value="/editsave",method=RequestMethod.POST)
public String editsaveMed(@ModelAttribute("med")Medicine med){
mdao.update(med);
return "redirect:/selectAllMed";
}

//delete
@RequestMapping(value="/deletemed/{id}",method=RequestMethod.GET)
public String deleteMed(@PathVariable int mid){
pdao.delete(mid);
return "redirect:/selectAllMed";
}

@ResponseBody
@RequestMapping(value="/find/{id}",method=RequestMethod.GET,produces="application/json")
public Medicine findMed(@PathVariable("id")int mid){

return mdao.findById(mid);
}
@ModelAttribute
public void commonheadings(Model model1){
model1.addAttribute("msg", "Clinic Management System");
}
}

