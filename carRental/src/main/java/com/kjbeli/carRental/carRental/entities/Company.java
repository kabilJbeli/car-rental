package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2834950868118018638L;

	private Long companyID;

	@Id
	@Column(name = "COMPANYID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}

}
