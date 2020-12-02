package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR_TABLE")
public class Car {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="CAR_ID")
	private int id;
	@Column(name="CAR_MAKER")
	private String maker;
	@Column(name="CAR_MODEL")
	private String model;
	@Column(name="CAR_YEARMADE")
	private int yearMade;
	@Column(name="CAR_ISRSERVED")
	private boolean isReserved;
	
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
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
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
