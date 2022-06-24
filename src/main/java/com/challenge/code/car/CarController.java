package com.challenge.code.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping
    public void registerNewCar(@RequestBody Car car) {
        carService.addNewCar(car);
    }

    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") Long carId) {
        carService.deleteCar(carId);
    }

    @PutMapping(path = "{carId}")
    public void updateCar(@PathVariable("carId") Long carId,
            @RequestParam(required = false) String color) {
        carService.updateCar(carId, color);

    }
}
