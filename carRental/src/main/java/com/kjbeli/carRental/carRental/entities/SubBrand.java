package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubBrand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long subBrandId;

	private String subBrandName;

	@Id
	@Column(name = "SUBBRANDID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getSubBrandId() {
		return subBrandId;
	}

	public void setSubBrandId(Long subBrandId) {
		this.subBrandId = subBrandId;
	}

	public String getSubBrandName() {
		return subBrandName;
	}

	public void setSubBrandName(String subBrandName) {
		this.subBrandName = subBrandName;
	}

}
