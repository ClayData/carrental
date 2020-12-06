package com.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.model.Reservation;

@Component
public class ResValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return Reservation.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "car_id", "reservation.car_id.empty");
		ValidationUtils.rejectIfEmpty(errors, "user_email", "reservation.user_email.empty");
		ValidationUtils.rejectIfEmpty(errors, "pick_up", "reservation.pick_up.empty");
		ValidationUtils.rejectIfEmpty(errors, "drop_off", "reservation.drop_off.empty");
		
		Reservation res =(Reservation) target;
	}
}
