package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> createListCar() {
        return carDao.createCarList();
    }

    @Override
    public List<Car> countHtmlPage(Integer count, List<Car> list) {
        return carDao.countHtmlPage(count, list);
    }
}
