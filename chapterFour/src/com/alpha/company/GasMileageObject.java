package com.alpha.company;

import java.util.Scanner;

public class GasMileageObject {

    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();
        Scanner scan = new Scanner(System.in);

        //class variables
        double totalMpg = 0;
        double averageMpg;
        int tripCounter = 0;

        System.out.print("enter miles driven or enter -1 to exit: ");
        gasMileage.setMilesDriven((int) scan.nextDouble());

        if (gasMileage.getMilesDriven() != -1) {
            System.out.print("enter gallons used: ");
            gasMileage.setGallonsUsed((int) scan.nextDouble());
        }

        double MilesPerGallonForEachTrip;

        while (gasMileage.getMilesDriven() != -1) {
            MilesPerGallonForEachTrip = gasMileage.milesPerGallon();

            System.out.println();
            System.out.printf("miles per gallon of each trip: %.3fmpg%n", MilesPerGallonForEachTrip);

            totalMpg += MilesPerGallonForEachTrip;
            System.out.printf("total miles per gallon of all trips: %.3fmpg%n%n", totalMpg);

            System.out.print("enter miles driven or enter -1 to exit: ");
            gasMileage.setMilesDriven((int) scan.nextDouble());

            tripCounter++;

            if (gasMileage.getMilesDriven() != -1) {
                System.out.print("enter gallons used: ");
                gasMileage.setGallonsUsed((int) scan.nextDouble());
            }
        }

        averageMpg = (totalMpg / tripCounter);

        System.out.println();
        System.out.println("trip counter: "+ tripCounter);
        System.out.printf("total miles per gallon of all trips: %.3fmpg%n", totalMpg);
        System.out.printf("average niles per gallon: %.3fmpg", averageMpg);
    }

}
