package com.challenge.code.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.challenge.code.model.Car;

public interface CarDao {
    int insertCar(UUID id, Car car);

    default int addCar(Car car) {
        UUID id = UUID.randomUUID();
        return insertCar(id, car);
    }

    List<Car> selectAllCars();

    Optional<Car> selectCarById(UUID id);

    int deleteCarById(UUID id);

    int updateCarById(UUID id, Car person);
}
