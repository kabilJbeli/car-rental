package com.kjbeli.carRental.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjbeli.carRental.carRental.entities.Agreement;


public interface AgreementRepository extends JpaRepository<Agreement, Integer> {

}
