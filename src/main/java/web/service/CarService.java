package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCountedCars(int size);
    List<Car> allCars();
}
