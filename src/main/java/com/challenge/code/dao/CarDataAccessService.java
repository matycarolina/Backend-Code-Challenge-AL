package com.challenge.code.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.challenge.code.model.Car;

@Repository("postgres")
public class CarDataAccessService implements CarDao {

    @Override
    public int deleteCarById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int insertCar(UUID id, Car car) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Car> selectAllCars() {
        Car car = new Car(UUID.randomUUID(), "From Postgres DB", "From Postgres DB", "From Postgres DB",
                "From Postgres DB", "From Postgres DB");
        return List.of(car);
    }

    @Override
    public Optional<Car> selectCarById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateCarById(UUID id, Car car) {
        // TODO Auto-generated method stub
        return 0;
    }

}
