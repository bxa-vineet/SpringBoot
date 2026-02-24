package com.parking.car.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarEntity {

    @Id
    @Column(name = "reg_number")
    private Long regNumber;
    @Column(name = "brand")
    private String brand;
    @Column(name = "car_name")
    private String carName;

    public CarEntity(Long regNumber, String brand, String carName) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.carName = carName;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getCarName() {

        return carName;
    }

    public void setCarName(String carName) {

        this.carName = carName;
    }

    public Long getRegNumber() {

        return regNumber;
    }

    public void setRegNumber(Long regNumber) {

        this.regNumber = regNumber;
    }
}
