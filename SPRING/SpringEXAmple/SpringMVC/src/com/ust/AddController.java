package com.ust;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Component
public class AddController {

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public void add() {
		
		System.out.println("I am here");
		
	}
}
