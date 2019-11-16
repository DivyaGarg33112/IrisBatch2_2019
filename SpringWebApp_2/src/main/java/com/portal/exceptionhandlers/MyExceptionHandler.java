package com.portal.exceptionhandlers;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler({IOException.class, java.lang.ArithmeticException.class})
    public ModelAndView handleIOException(Exception ex) {
        ModelAndView model = new ModelAndView("Error");
 
        model.addObject("exception", ex.getMessage());
         
        return model;
    }

}
