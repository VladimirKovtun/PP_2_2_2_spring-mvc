package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(@Autowired CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCountedCars(int size) {
        return carDao.getCars().stream().limit(size).toList();
    }

    @Override
    public List<Car> allCars() {
        return carDao.getCars();
    }
}
