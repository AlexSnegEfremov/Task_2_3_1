package web;

import web.service.CarServiceImpl;

public class MainMicroTesting {
    public static void main(String[] args) {
        CarServiceImpl carService = new CarServiceImpl();
        System.out.println(carService.createListCar());
        System.out.println(carService.countHtmlPage(2, carService.createListCar()));
    }
}
