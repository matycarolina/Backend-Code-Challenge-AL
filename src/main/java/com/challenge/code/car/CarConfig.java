package com.challenge.code.car;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository) {
        return args -> {
            Car car1 = new Car("ABC1234", "ROJO", "SEDAN", "KIA", "ADG234FF");
            Car car2 = new Car("CBA4321", "AZUL", "SEDAN", "FIAT", "FF432GDA");
            repository.saveAll(List.of(car1, car2));
        };
    }
}
