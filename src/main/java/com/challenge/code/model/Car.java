package com.challenge.code.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final UUID id;

    @NotBlank
    private final String plate;
    @NotBlank
    private final String color;
    @NotBlank
    private final String model;
    @NotBlank
    private final String chassis;
    @NotBlank
    private final String brand;

    public Car(@JsonProperty("id") UUID id, @JsonProperty("plate") String plate, @JsonProperty("color") String color,
            @JsonProperty("model") String model, @JsonProperty("chassis") String chassis,
            @JsonProperty("brand") String brand) {
        this.id = id;
        this.plate = plate;
        this.color = color;
        this.model = model;
        this.chassis = chassis;
        this.brand = brand;
    }

    public UUID getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getChassis() {
        return chassis;
    }

    public String getBrand() {
        return brand;
    }
}
