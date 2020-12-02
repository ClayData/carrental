package com.spring.DAO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
//	
//	@NotNull(message="is required")
//	@Size(min=1)
	private String email;
	
//	@NotNull(message="is required")
//	@Size(min=1)
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
