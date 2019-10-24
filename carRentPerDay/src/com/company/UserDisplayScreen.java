package com.company;

import java.util.ArrayList;

public class UserDisplayScreen {

    private static final int COLUMN_WIDTH= 15;

    public  static void print(ArrayList<Car> carInfo){

        printTableCell("Car Name");
        printTableCell("Car Rent/ day");
        printTableCell("Car Rent/ km");
        printTableCell("Lurury Rate");
        printTableCell("Car ID");

        for(int i=0;i<carInfo.size();i++) {

            Car car= carInfo.get(i);

            System.out.println("\n");

            printTableCell(car.getCarName());
            printTableCell(String.valueOf(car.getCarRentPerDay()));
            printTableCell(String.valueOf(car.getCarRentPerKm()));
            printTableCell(String.valueOf(car.getCarId()));
        }
    }

    static void printTableCell(String cellValue){

        if (cellValue.length()<COLUMN_WIDTH){
            System.out.print(cellValue);
            for (int s= cellValue.length(); s<=COLUMN_WIDTH; s++){
                System.out.print(" ");
            }
        } else {
            cellValue= cellValue.substring(0, COLUMN_WIDTH-3);
            cellValue+="..";
            System.out.print(cellValue);
        }
    }
}
