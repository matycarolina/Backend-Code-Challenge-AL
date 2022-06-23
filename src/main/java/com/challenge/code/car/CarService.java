package com.challenge.code.car;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void addNewCar(Car newCar) {
        Optional<Car> carOptional = carRepository.findCarByPlate(newCar.getPlate());
        if (carOptional.isPresent()) {
            throw new IllegalStateException("Placa ya existe");
        }
        carRepository.save(newCar);
    }

    public void deleteCar(Long carId) {
        boolean exists = carRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException(
                    "Vehiculo " + carId + " no existe");

        }
        carRepository.deleteById(carId);
    }

    @Transactional
    public void updateCar(Long carId, String color) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new IllegalStateException("Vehiculo " + carId + " no existe"));
        if (color != null && color.length() > 0 && !Objects.equals(car.getColor(), color)) {
            car.setColor(color);
        }
    }
}
