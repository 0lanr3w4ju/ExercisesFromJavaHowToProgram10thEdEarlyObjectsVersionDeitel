package com.alpha.company;

import java.util.Scanner;

public class AirlineReservationAppDriver {

    public static void main(String[] args) {

        AirlineReservationApp airlineReservationApp = new AirlineReservationApp();
        Scanner scan = new Scanner(System.in);

        //instance variable
        int entry;

        airlineReservationApp.welcome();

        entry = scan.nextInt();

        switch (entry) {

            case 1 -> {
                int y_coordinate = 0, x_coordinate = 0;

                System.out.println
                        ("__fill in passengers details__\n" +
                        "or CTRL + D to exit the program");

                System.out.print("first name: ");
                while (scan.hasNext()) { // while loop
                    airlineReservationApp.add_passenger_detail("first name", scan.next());

                    System.out.print("last name: ");
                    airlineReservationApp.add_passenger_detail("last name", scan.next());

                    System.out.print("phone: ");
                    airlineReservationApp.add_passenger_detail("phone", scan.next());

                    System.out.print("nationality: ");
                    airlineReservationApp.add_passenger_detail("nationality", scan.next());

                    System.out.print("destination: ");
                    airlineReservationApp.add_passenger_detail("destination", scan.next());

                    System.out.println("saved!");

                    airlineReservationApp.seating_position[y_coordinate][x_coordinate] = airlineReservationApp.passzenger;

                    System.out.println(airlineReservationApp.seating_position[y_coordinate][x_coordinate]); // proof

                    x_coordinate++; // counter to place passengers in seats when adding

                    if (x_coordinate == 3) {
                        y_coordinate++;
                    }

                    if (y_coordinate == 10) {
                        System.out.println("seat full!");
                    }

                    System.out.println();

                    System.out.print("first name: ");
                }

            }

//            case 2 -> {
//                int seatNo;
//
//                System.out.println
//                        ("__check for passengers names by their seat numbers(1 - 40)__\n" +
//                                "enter seat NO.: ");
//
//                seatNo = scan.nextInt();
//
//
//            }
            default -> throw new IllegalStateException("Unexpected value: " + entry);
        }

        System.out.println(airlineReservationApp.seating_position[0][0]);
        System.out.println(airlineReservationApp.seating_position[0][1]);
        System.out.println(airlineReservationApp.seating_position[0][3]);

    }
}
