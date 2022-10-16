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

import com.kjbeli.carRental.carRental.entities.User;
import com.kjbeli.carRental.carRental.interfaces.IUser;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/user")
public class UserController {

	private IUser Iuser;

	@GetMapping("/getUserList")
	public List<User> getUserList() {
		return null;
	}
	
	@GetMapping("/getUserById")
	public User getUserById(@RequestParam Integer userId) {
		return null;
	}
	
	@PostMapping("/createUser")
	public Boolean createUser(User user) {
		return null;
	}
	
	@PutMapping("/updateUserInformation")
	public Boolean updateUserInformation(User user) {
		return null;
	}
	
	@DeleteMapping("/removeUserById")
	public Boolean removeUserById(@RequestParam Integer userId) {
		return null;
	}
}
