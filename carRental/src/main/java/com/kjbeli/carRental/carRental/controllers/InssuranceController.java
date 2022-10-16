package com.kjbeli.carRental.carRental.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kjbeli.carRental.carRental.entities.Car;
import com.kjbeli.carRental.carRental.entities.Company;
import com.kjbeli.carRental.carRental.entities.Inssurance;
import com.kjbeli.carRental.carRental.interfaces.IInssurance;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/inssurance")
public class InssuranceController {

	private IInssurance Iinssurance;

	@GetMapping("/getInssuranceListByCar")
	public List<Inssurance> getInssuranceListByCar(Car car) {
		return null;
	}
	
	@GetMapping("/getCurrentCarInssurance")
	public Inssurance getCurrentCarInssurance(Car car) {
		return null;
	}
	
	@GetMapping("/getCompanyValidInssurance")
	public Company getCompanyValidInssurance(@RequestParam Integer companyId) {
		return null;
	}
	
	@PostMapping("/createInssurance")
	public Boolean addCompany(Car car) {
		return null;
	}
	
}
