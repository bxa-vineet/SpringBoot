package com.parking.car.Service;

import com.parking.car.dto.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Service
public class CarService {

    HashMap<Long, Car> hasmap = new HashMap<>();

    public HashMap<Long, Car> addCarInfo(Car car) {
        hasmap.put(car.getRegNumber(),car);
        return hasmap;
    }

    public String getCarInfoFromRegNumber(Long id) {
        return hasmap.get(id).getCarName();
    }

}
