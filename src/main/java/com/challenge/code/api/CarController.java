package com.challenge.code.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.code.model.Car;
import com.challenge.code.service.CarService;

@RequestMapping("api/v1/car")
@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void addCar(@Valid @NonNull @RequestBody Car car) {
        carService.addCar(car);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(path = "{id}")
    public Car getCarById(@PathVariable("id") UUID id) {
        return carService.getCarById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCarById(@PathVariable("id") UUID id) {
        carService.deleteCar(id);
    }

    @PutMapping(path = "{id}")
    public void updateCar(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Car carToUpdate) {
        carService.updateCar(id, carToUpdate);
    }
}
