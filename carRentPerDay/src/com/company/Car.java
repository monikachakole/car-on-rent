package com.company;

import java.util.ArrayList;

public class Car {

    private String carName;
    private int carRentPerDay;
    private int carRentPerKm;
    private int carId;

    final int DRIVERRATE = 1000;

    public Car(String carName, int carRentPerDay, int carRentPerKm, int carId) {
        this.carName = carName;
        this.carRentPerDay = carRentPerDay;
        this.carRentPerKm = carRentPerKm;
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarRentPerDay() {
        return carRentPerDay;
    }

    public int getCarRentPerKm() {
        return carRentPerKm;
    }

    public int getCarId(){
        return carId;
    }

    public int calculateRent(int noOfDay, boolean driverNeeded) {

        int totalCharge= noOfDay* this.carRentPerDay;
        int driverCharge= 0;

        if (driverNeeded){
            driverCharge= DRIVERRATE* noOfDay;
        }

        totalCharge+= driverCharge;

        return totalCharge;
    }
}
