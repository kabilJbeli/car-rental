package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long brandId;
	private String brandName;

	private SubBrand subBrand;

	@Id
	@Column(name = "BRANDID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public SubBrand getSubBrand() {
		return subBrand;
	}

	public void setSubBrand(SubBrand subBrand) {
		this.subBrand = subBrand;
	}

}
