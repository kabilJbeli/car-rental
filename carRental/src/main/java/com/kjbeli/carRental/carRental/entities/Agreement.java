package com.kjbeli.carRental.carRental.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agreement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2011086221799437371L;

	private Long contractID;

	private Company Owner;
	private User Renter;

	private LocalDate startDate;
	private LocalDate endDate;
	private double deposit;
	private double totalFee;
	private boolean paid;
	private double remainingFee;

	private LocalDateTime dateOfSignature;

	@Id
	@Column(name = "CONTRACTID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getContractID() {
		return contractID;
	}

	public void setContractID(Long contractID) {
		this.contractID = contractID;
	}

	public Company getOwner() {
		return Owner;
	}

	public void setOwner(Company owner) {
		Owner = owner;
	}

	public User getRenter() {
		return Renter;
	}

	public void setRenter(User renter) {
		Renter = renter;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public double getRemainingFee() {
		return remainingFee;
	}

	public void setRemainingFee(double remainingFee) {
		this.remainingFee = remainingFee;
	}

	public LocalDateTime getDateOfSignature() {
		return dateOfSignature;
	}

	public void setDateOfSignature(LocalDateTime dateOfSignature) {
		this.dateOfSignature = dateOfSignature;
	}

}
