package com.challenge.code.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.challenge.code.model.Car;

@Repository("fakeDao")
public class FakeCarDataAccessService implements CarDao {
    private static List<Car> DB = new ArrayList<>();

    @Override
    public int deleteCarById(UUID id) {
        Optional<Car> carMaybe = selectCarById(id);
        if (carMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(carMaybe.get());
        return 1;
    }

    @Override
    public int insertCar(UUID id, Car car) {
        DB.add(new Car(id, car.getPlate(), car.getColor(), car.getModel(), car.getChassis(), car.getBrand()));
        return 1;
    }

    @Override
    public List<Car> selectAllCars() {
        return DB;
    }

    @Override
    public Optional<Car> selectCarById(UUID id) {
        return DB.stream().filter(car -> car.getId().equals(id)).findFirst();
    }

    @Override
    public int updateCarById(UUID id, Car update) {
        return selectCarById(id).map(p -> {
            int indexOfCarToUpdate = DB.indexOf(p);
            if (indexOfCarToUpdate >= 0) {
                DB.set(indexOfCarToUpdate, new Car(id, update.getPlate(), update.getColor(), update.getModel(),
                        update.getChassis(), update.getBrand()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

}
