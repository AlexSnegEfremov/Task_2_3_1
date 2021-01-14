package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createCarList() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", "6", "2012"));
        cars.add(new Car("Lada", "Granta", "2014"));
        cars.add(new Car("Honda", "Civik", "2008"));
        cars.add(new Car("Cherry", "Tiggo", "2015"));
        cars.add(new Car("Lada", "2101", "1990"));
        return cars;
    }

    @Override
    public List<Car> countHtmlPage(Integer count, List<Car> list) {
        if (count == null || count >= 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }
}


