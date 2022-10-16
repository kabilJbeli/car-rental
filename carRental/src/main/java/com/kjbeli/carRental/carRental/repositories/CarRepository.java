package com.kjbeli.carRental.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjbeli.carRental.carRental.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
