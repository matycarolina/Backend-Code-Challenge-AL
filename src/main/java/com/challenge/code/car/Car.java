package com.challenge.code.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Car {
    @Id
    @SequenceGenerator(name = "car_sequence", sequenceName = "car_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_sequence")
    private Long id;
    private String plate;
    private String color;
    private String model;
    private String brand;
    private String chassis;

    public Car() {
    }

    public Car(Long id, String plate, String color, String model, String brand, String chassis) {
        this.id = id;
        this.plate = plate;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.chassis = chassis;
    }

    public Car(String plate, String color, String model, String brand, String chassis) {
        this.plate = plate;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.chassis = chassis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", chassis=" + chassis + ", color=" + color + ", id=" + id + ", model=" + model
                + ", plate=" + plate + "]";
    }

}
