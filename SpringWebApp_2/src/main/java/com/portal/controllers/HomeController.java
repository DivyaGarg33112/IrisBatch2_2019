package com.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.models.User;

@Controller
public class HomeController {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello(ModelMap map){
		//can perform business logic here
		map.addAttribute("myData","Welcome to Spring Web MVC!!!");
		
		return "HomePage";
	}
	
	@RequestMapping(value="/getSignUpForm",method=RequestMethod.GET)
	public String displayRegisterForm(ModelMap map){
		map.addAttribute("userObj",new User());
		return "SignUpForm";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User userObj,ModelMap map){
		//Will write the code to insert the object into the database
		map.addAttribute("msg","User has been registered succesfully. Now u can Login");
		return "SignInForm";
	}
}
