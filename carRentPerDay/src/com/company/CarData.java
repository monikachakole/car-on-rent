package com.company;

import java.util.ArrayList;

public class CarData {

    private ArrayList<Car> carInfo = new ArrayList<>();

    CarData(){
        Car car1 = new Car("Swift", 1200, 15, 2165);
        Car car2 = new Car("Baleno", 1500, 18, 3532);
        LuxuryCar car3 = new LuxuryCar("Wagon R", 800, 12, 3422, 1500);
        LuxuryCar car4 = new LuxuryCar("Scorpio", 2200, 25, 4352, 5000);

        carInfo.add(car1);
        carInfo.add(car2);
        carInfo.add(car3);
        carInfo.add(car4);
    }

    public ArrayList<Car> getCarInfo() {
        return carInfo;
    }
}
