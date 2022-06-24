package com.challenge.code.car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findCarByPlate(String plate);

}
