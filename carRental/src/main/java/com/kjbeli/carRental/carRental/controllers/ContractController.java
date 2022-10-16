package com.kjbeli.carRental.carRental.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kjbeli.carRental.carRental.entities.Car;
import com.kjbeli.carRental.carRental.entities.Company;
import com.kjbeli.carRental.carRental.entities.Contract;
import com.kjbeli.carRental.carRental.interfaces.IContract;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/contract")
public class ContractController {

	private IContract Icontract;

	@GetMapping("/getContractListByCompany")
	public List<Contract> getContractListByCompany(Company company) {
		return null;
	}
	
	@GetMapping("/getContractList")
	public List<Contract> getContractList() {
		return null;
	}
	
	@GetMapping("/getContractListByCar")
	public List<Contract> getContractListByCar(Car car) {
		return null;
	}
	
	@PostMapping("/creatContract")
	public Boolean creatContract(Contract contract) {
		return null;
	}
	
	@PutMapping("/updateContractInformation")
	public Boolean updateContractInformation(Contract contract) {
		return null;
	}	

}
