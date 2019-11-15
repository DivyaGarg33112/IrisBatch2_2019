package com.portal.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.portal.models.User;

@Component
public class GenderValidator implements Validator{

	@Override
	public boolean supports(Class<?> obj) {
		return User.class.isAssignableFrom(obj);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace
		(errors, "gender", "error.gender","Gender is required in custom validations...");
		
		User uObj=(User)target;
		String gender=uObj.getGender();
		
		if((gender.equals("Male")) || (gender.equals("Female"))){
			System.out.println("Correct");
		}
		else {
			errors.reject("gender","Only Male and Female allowed for Gender");
		}
		
		
	}

	
}
