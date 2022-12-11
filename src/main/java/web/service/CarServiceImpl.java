package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = Arrays.asList(
            new Car("Lada", 2022, "dark"),
            new Car("BMW", 2010, "blue"),
            new Car("Mercedes", 1999, "white"),
            new Car("Toyota", 2014, "blue metallic"),
            new Car("Honda", 2006, "silver"));

    @Override
    public List<Car> getCars(int size) {
        return cars.stream().limit(size).toList();
    }

    @Override
    public List<Car> allCars() {
        return cars;
    }
}
