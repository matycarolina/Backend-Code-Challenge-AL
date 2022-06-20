package com.challenge.code.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.challenge.code.dao.CarDao;
import com.challenge.code.model.Car;

@Service
public class CarService {
    private final CarDao carDao;

    @Autowired
    public CarService(@Qualifier("postgres") CarDao carDao) {
        this.carDao = carDao;
    }

    public int addCar(Car car) {
        return carDao.addCar(car);
    }

    public List<Car> getAllCars() {
        return carDao.selectAllCars();
    }

    public Optional<Car> getCarById(UUID id) {
        return carDao.selectCarById(id);
    }

    public int deleteCar(UUID id) {
        return carDao.deleteCarById(id);
    }

    public int updateCar(UUID id, Car newCar) {
        return carDao.updateCarById(id, newCar);
    }
}
