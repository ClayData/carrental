package com.spring.validator;

import java.util.regex.Pattern;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.model.CustomerModel;

@Component
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return CustomerModel.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "customer.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "customer.password.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "customer.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "age", "customer.age.empty");
		
		CustomerModel customer =(CustomerModel) target;
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		if(!pattern.matcher(customer.getEmail()).matches()) {
			errors.rejectValue("email", "customer.email.invalid");
		}
		
//		
//		Pattern pattern1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$", Pattern.CASE_INSENSITIVE);
//		if(!pattern1.matcher(customer.getPassword()).matches()) {
//			errors.rejectValue("password", "customer.password.empty");
//		}
	}

}
