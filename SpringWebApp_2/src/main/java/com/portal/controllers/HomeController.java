package com.portal.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.portal.daos.UserDao;
import com.portal.models.User;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;
	
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
		userDao.registerUser(userObj);
		map.addAttribute("msg","User has been registered succesfully. Now u can Login");
		return "SignInForm";
	}
	
	
	
	@RequestMapping(value="/getSignInForm",method=RequestMethod.GET)
	public String getSignInForm(){
		return "SignInForm";
	}
	
	/*@Autowired
	HttpServletRequest request;
	
	
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public String validateUser(){
		int id=Integer.parseInt(request.getParameter("userId"));
		String pass=request.getParameter("pass");
		
		User uObj=userDao.validateUser(id,pass);
		if(uObj==null){
			return "SignInForm";
		}
		else {
			return "Success";
		}
	}*/
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public String validateUser(@RequestParam int userId,@RequestParam String pass){
		User uObj=userDao.validateUser(userId,pass);
		if(uObj==null){
			return "SignInForm";
		}
		else {
			session.setAttribute("uObj",uObj);
			return "Success";
		}
	}
}
















