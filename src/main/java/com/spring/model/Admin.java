package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ADMIN_ID")
	private int id;
	
	@Column(name="ADMIN_EMAIL")
	private String email;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
}
