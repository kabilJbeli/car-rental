package com.kjbeli.carRental.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjbeli.carRental.carRental.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
