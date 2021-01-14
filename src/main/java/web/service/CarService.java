package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> createListCar();

    List<Car> countHtmlPage(Integer count, List<Car> list);
}
