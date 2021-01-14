package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDaoImpl carDao;

    @Autowired
    public void setCarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> createListCar() {
        return carDao.createCarList();
    }

    @Override
    public List<Car> countHtmlPage(Integer count, List<Car> list) {
        return carDao.countHtmlPage(count, list);
    }
}
