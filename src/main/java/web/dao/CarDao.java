package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> createCarList();

    List<Car> countHtmlPage(Integer count, List<Car> list);
}
