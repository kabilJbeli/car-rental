package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7660051188277116062L;

	private Long carSerialNumber;

	private Brand brand;
	private int mileage;
	private int registrationYear;
	private String color;

	@Id
	@Column(name = "CARSERIALNUMBER")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCarSerialNumber() {
		return carSerialNumber;
	}

	public void setCarSerialNumber(Long carSerialNumber) {
		this.carSerialNumber = carSerialNumber;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(int registrationYear) {
		this.registrationYear = registrationYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
