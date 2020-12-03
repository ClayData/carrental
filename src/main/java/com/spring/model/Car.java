package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
public class Car {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="car_id")
	private int id;
	@Column(name="maker")
	private String maker;
	@Column(name="model")
	private String model;
	@Column(name="year_made")
	private int yearMade;
	@Column(name="isReserved")
	private String isReserved;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public String isReserved() {
		return isReserved;
	}
	public void setReserved(String isReserved) {
		this.isReserved = isReserved;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", maker=" + maker + ", model=" + model + ", yearMade=" + yearMade + ", isReserved="
				+ isReserved + ", getId()=" + getId() + ", getMaker()=" + getMaker() + ", getModel()=" + getModel()
				+ ", getYearMade()=" + getYearMade() + ", isReserved()=" + isReserved() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
