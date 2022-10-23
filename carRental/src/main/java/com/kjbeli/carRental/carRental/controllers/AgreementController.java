package com.kjbeli.carRental.carRental.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kjbeli.carRental.carRental.entities.Agreement;
import com.kjbeli.carRental.carRental.entities.Car;
import com.kjbeli.carRental.carRental.entities.Company;
import com.kjbeli.carRental.carRental.interfaces.IAgreement;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/agreement")
public class AgreementController {

	private IAgreement Iagreement;

	@GetMapping("/getAgreementListByCompany")
	public List<Agreement> getAgreementListByCompany(Company company) {
		return null;
	}
	
	@GetMapping("/getAgreementList")
	public List<Agreement> getAgreementList() {
		return null;
	}
	
	@GetMapping("/getAgreementListByCar")
	public List<Agreement> getAgreementListByCar(Car car) {
		return null;
	}
	
	@PostMapping("/creatAgreement")
	public Boolean creatAgreement(Agreement contract) {
		return null;
	}
	
	@PutMapping("/updateAgreementInformation")
	public Boolean updateAgreementInformation(Agreement contract) {
		return null;
	}	

}
