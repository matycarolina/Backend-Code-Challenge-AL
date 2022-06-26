package com.challenge.code.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "plate")
    private String plate;
    @Column(name = "color")
    private String color;
    @Column(name = "model")
    private String model;
    @Column(name = "brand")
    private String brand;
    @Column(name = "chassis")
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
