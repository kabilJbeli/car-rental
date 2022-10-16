package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inssurance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 844058551203550080L;

	private Integer inssuranceID;

	@Id
	@Column(name = "INSSURANCEID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getInssuranceID() {
		return inssuranceID;
	}

	public void setInssuranceID(Integer inssuranceID) {
		this.inssuranceID = inssuranceID;
	}
	
	
}
