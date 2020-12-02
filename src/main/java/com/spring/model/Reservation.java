package com.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservations")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="RESERVATION_ID")
	private int id;
	
	@Column(name="CAR_ID")
	private int car_id;
	
	@Column(name="USER_EMAIL")
	private String user_email;
	
	@Column(name="PICK_UP")
	private Date pick_up;
	
	@Column(name="DROP_OFF")
	private Date drop_off;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getPick_up() {
		return pick_up;
	}

	public void setPick_up(Date pick_up) {
		this.pick_up = pick_up;
	}

	public Date getDrop_off() {
		return drop_off;
	}

	public void setDrop_off(Date drop_off) {
		this.drop_off = drop_off;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", car_id=" + car_id + ", user_email=" + user_email + ", pick_up=" + pick_up
				+ ", drop_off=" + drop_off + "]";
	}
	
}
