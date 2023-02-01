package de.neuefische.neuefischevalidationdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @PostMapping
    public Car addCar(@Valid @RequestBody Car car) {
        // TODO: Save car in database
        return car;
    }
}
