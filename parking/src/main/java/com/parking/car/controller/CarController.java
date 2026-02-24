package com.parking.car.controller;

import com.parking.car.Service.CarService;
import com.parking.car.dto.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/info/{id}")
    public String getCarInfoFromRegNumber(@PathVariable Long id) {

        return carService.getCarInfoFromRegNumber(id);
    }

    @PostMapping("/addCarInfo/")
    public HashMap<Long, Car> addCarInfo(@RequestBody Car car) {

        return carService.addCarInfo(car);
    }
}


