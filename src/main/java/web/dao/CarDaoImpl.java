package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = Arrays.asList(
            new Car("Lada", 2022, "dark"),
            new Car("BMW", 2010, "blue"),
            new Car("Mercedes", 1999, "white"),
            new Car("Toyota", 2014, "blue metallic"),
            new Car("Honda", 2006, "silver"));
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
