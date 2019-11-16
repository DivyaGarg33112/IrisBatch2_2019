package com.portal.controllers;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.portal.daos.UserDao;
import com.portal.models.User;
import com.portal.validators.GenderValidator;

@Controller
public class HomeController {

	@Autowired
	GenderValidator myValidator;
	
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
		
		/*int[] arr=new int[2];
		arr[11]=20;
		*/
		map.addAttribute("userObj",new User());
		map.addAttribute("btnLabel","Sign Up");
		map.addAttribute("formLabel", "SignUp Form");
		return "SignUpForm";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@Valid @ModelAttribute("userObj")  User userObj,
			BindingResult result){
		//Will write the code to insert the object into the database
		
		myValidator.validate(userObj, result);
		
		if(result.hasErrors()){
			System.out.println("I m here..");
			ModelAndView mv=new ModelAndView("SignUpForm");
			//mv.addObject("userObj",new User());
			mv.addObject("btnLabel","Sign Up");
			mv.addObject("formLabel", "SignUp Form");	
			return mv;
		}
		else {
		userObj.setRole("User");
		userDao.registerUser(userObj);
		
		ModelAndView mv=new ModelAndView("SignInForm");
		mv.addObject("msg","User has been registered succesfully. Now u can Login");
		return mv;
		}
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
			String role=uObj.getRole();
			session.setAttribute("uObj",uObj);
			
			if(role.equals("Admin")){
				return "AdminSuccess";
			}
			else {
				return "UserSucces";
			}
		}
	}
	
	@ExceptionHandler({ArithmeticException.class,IOException.class,
		ArrayIndexOutOfBoundsException.class})
	public ModelAndView myExceptionHandler(){
		System.out.println("I m exception Handler method");
		ModelAndView mv=new ModelAndView("Error");
		mv.addObject("errorMsg","Some Issue occured try later..");
		return mv;
	}
}



















