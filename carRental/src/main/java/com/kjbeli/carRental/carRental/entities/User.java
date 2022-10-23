package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RentalUser")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1743694997128395211L;

	private Long userID;
	private String firstName;
	private String lastName;
	private String address;
	private Integer cin;
	private LocalDate dateOfBirth;
	private Long driverLicenceNumber;

	@Id
	@Column(name = "USERID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getDriverLicenceNumber() {
		return driverLicenceNumber;
	}

	public void setDriverLicenceNumber(Long driverLicenceNumber) {
		this.driverLicenceNumber = driverLicenceNumber;
	}

}
