package com.alpha.company;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
/*
    an application that takes input of the following information
    and display the user’s cost per day of driving to work:
    a) Total miles driven per day.
    b) Cost per gallon of gasoline.
    c) Average miles per gallon.
    d) Parking fees per day.
    e) Tolls per day.
*/

    //class variables
    int totalMilesDrivenPerDay;
    int costPerGallonOfGasoline;
    int averageMilesPerGallon;
    int parkingFeesPerDay;
    int tollsPerDay;

    //class Method
    public int costPerDayOfDriving(int totalMilesDrivenPerDay, int costPerGallonOfGasoline, int averageMilesPerGallon, int parkingFeesPerDay, int tollsPerDay) {
        return (totalMilesDrivenPerDay / averageMilesPerGallon) * costPerGallonOfGasoline + parkingFeesPerDay + tollsPerDay;
    }

    //class object
    public static void main(String[] args) {
        CarPoolSavingsCalculator carPoolSavingsCalculator = new CarPoolSavingsCalculator();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter total miles driven per day: ");
        carPoolSavingsCalculator.totalMilesDrivenPerDay = scan.nextInt();

        System.out.print("enter average miles per gallon: ");
        carPoolSavingsCalculator.averageMilesPerGallon = scan.nextInt();

        System.out.print("enter cost per gallon of gasoline: ");
        carPoolSavingsCalculator.costPerGallonOfGasoline = scan.nextInt();

        System.out.print("enter parking fees per day: ");
        carPoolSavingsCalculator.parkingFeesPerDay = scan.nextInt();

        System.out.print("enter tolls per day: ");
        carPoolSavingsCalculator.tollsPerDay = scan.nextInt();

        //output
        System.out.println("cost of driving per day = "+ carPoolSavingsCalculator.costPerDayOfDriving(carPoolSavingsCalculator.totalMilesDrivenPerDay, carPoolSavingsCalculator.costPerGallonOfGasoline, carPoolSavingsCalculator.averageMilesPerGallon, carPoolSavingsCalculator.parkingFeesPerDay, carPoolSavingsCalculator.tollsPerDay));
    }

}
