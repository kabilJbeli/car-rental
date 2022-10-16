package com.kjbeli.carRental.carRental.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kjbeli.carRental.carRental.entities.Car;
import com.kjbeli.carRental.carRental.entities.Company;
import com.kjbeli.carRental.carRental.interfaces.ICar;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/car")
public class CarController {

	private ICar Icar;

	@GetMapping("/getCarListByCompany")
	public List<Car> getCarListByCompany(Company company) {
		return null;
	}
	
	@GetMapping("/getCarList")
	public List<Car> getCarList() {
		return null;
	}
	
	@GetMapping("/getCarBySerialNumber")
	public Car getCarBySerialNumber(@RequestParam Long serialNumber) {
		return null;
	}
	
	@PostMapping("/addCar")
	public Boolean addCar(Car car) {
		return null;
	}
	
	@PutMapping("/updateCarInformation")
	public Boolean updateCarInformation(Car car) {
		return null;
	}
	
	@DeleteMapping("/removeCarBySerialNumber")
	public Boolean removeCarBySerialNumber(@RequestParam Long serialNumber) {
		return null;
	}
}
