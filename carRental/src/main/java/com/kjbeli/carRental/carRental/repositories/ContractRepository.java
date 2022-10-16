package com.kjbeli.carRental.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjbeli.carRental.carRental.entities.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
