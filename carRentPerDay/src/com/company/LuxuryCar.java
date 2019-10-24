package com.company;

import java.util.ArrayList;

public class LuxuryCar extends Car {

    private int luxuryCarRate;

    LuxuryCar(String carName, int carRentPerDay, int carRentPerKm, int carId, int luxuryCarRate){
        super(carName, carRentPerDay, carRentPerKm, carId);
        this.luxuryCarRate = luxuryCarRate;
    }

    public int getLuxuryCarRate(){
        return luxuryCarRate;
    }

    @Override
    public int calculateRent(int noOfDay, boolean driverNeeded) {

        int totalCharge= noOfDay* super.getCarRentPerDay();
        int driverCharge= 0;

        if (driverNeeded){
            driverCharge= DRIVERRATE* noOfDay;
        }

        totalCharge+= driverCharge;
        totalCharge+= luxuryCarRate;

        return totalCharge;
    }
}
