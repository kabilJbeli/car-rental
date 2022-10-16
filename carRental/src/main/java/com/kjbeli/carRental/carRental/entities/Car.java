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

	@Id
	@Column(name = "CARSERIALNUMBER")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCarSerialNumber() {
		return carSerialNumber;
	}

	public void setCarSerialNumber(Long carSerialNumber) {
		this.carSerialNumber = carSerialNumber;
	}
	
	
}
