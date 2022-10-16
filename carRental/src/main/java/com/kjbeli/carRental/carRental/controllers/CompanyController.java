package com.kjbeli.carRental.carRental.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.kjbeli.carRental.carRental.entities.Company;
import com.kjbeli.carRental.carRental.interfaces.ICompany;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/company")
public class CompanyController {

	private ICompany Icompany;

	@GetMapping("/getCompaniesList")
	public List<Company> getCompaniesList() {
		return null;
	}
	
	@GetMapping("/getCompanyById")
	public Company getCompanyById(@RequestParam Integer companyId) {
		return null;
	}
	
	@PostMapping("/addCompany")
	public Boolean addCompany(Company company) {
		return null;
	}
	
	@PutMapping("/updateCompanyInformation")
	public Boolean updateCompanyInformation(Company company) {
		return null;
	}
	
	@DeleteMapping("/removeCompanyById")
	public Boolean removeCompanyById(@RequestParam Integer companyId) {
		return null;
	}
}
