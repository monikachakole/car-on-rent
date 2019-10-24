package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String carName;
        int noOfDay;
        String driverNeeded;
        int carId;
        String luxuryCar;
        Car selectedCar = null;

        CarData carData= new CarData();
        ArrayList<Car> carInfo = carData.getCarInfo();

        Scanner scanner = new Scanner(System.in);

        UserDisplayScreen.print(carInfo);   //To display table

        System.out.println("\n \n Enter the Car ID: ");
        carId = scanner.nextInt();

        for (int i = 0; i < carInfo.size(); i++) {
            if (carId == carInfo.get(i).getCarId()) {
                selectedCar = carInfo.get(i);
                break;
            }
        }

        System.out.println("For How Many Days You need car on rent ");
        noOfDay = scanner.nextInt();


        System.out.println("You need driver? yes/no ");
        driverNeeded = scanner.next();
        boolean isDriverNeeded = false;
        if (driverNeeded.equalsIgnoreCase("yes")) {
            isDriverNeeded = true;
        }

        int totalCharge = selectedCar.calculateRent(noOfDay, isDriverNeeded);

        System.out.println("Cost of selected car: "+selectedCar.getCarName()+" for " + noOfDay + "day is: " + totalCharge);
        System.out.println("Additional charge of " + selectedCar.getCarRentPerKm() + " rupees per km");


    }
}


