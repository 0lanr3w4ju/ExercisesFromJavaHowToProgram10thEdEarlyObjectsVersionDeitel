package com.alpha.company;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNull;

public class SeatReservation {

    String[][] seating_position = new String[6][6];

    String[] waiting_list = new String[6];

    private int row = 0, column = 0, waiting_list_row = 0;

    // method adds name to seats
    public void addPassengerToSeat(String nameToSeat) {
        if (nameToSeat.length() > 0) {
            try {
                seating_position[row][column] = nameToSeat;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Plane is Full..");

                waiting_list[waiting_list_row] = nameToSeat;
                    System.out.printf("Added Passenger to Waiting List No. %d%n", waiting_list_row);

                    try {
                        ++waiting_list_row;
                    } catch (ArrayIndexOutOfBoundsException exception1) {
                        System.out.println("We are Totally Booked, Please Check Back Later..");
                    }

            }

            if (row < 6) {
                if (column < 6) {
                    System.out.printf("Added Passenger to Row %d Column %d%n", row, column);
                }
            }

            ++column;

            if (column > 5) {
                column = 0;
                ++row;
            }
        }
        else {
            System.out.println("Invalid: Empty Input");
        }
    }

    // method return name from seat
    public void getNamesFromSeat() {
        for (String[] seats : seating_position) {
            for (String names : seats) {
                System.out.printf("seat %s holds %s%n", Arrays.toString(seats), names);
            }
        }
    }

    // this method greets user and provides options to interact with the application
    public String welcomeUserAndProvideOptionsMethod() {
        return """
                __Welcome to Traffic Travels__
                -- 1 : Add a Passenger to List
                -- 2 : Remove Passenger From List
                -- 3 : Quit  
                > """;
    }

    // this method removes a passenger from a given seat
    public void removePassengerFromSeat(int row, int column) {
        if (row >= 0 && column >= 0) {
            if (row <= 5 && column <= 5) {
                String passenger = seating_position[row][column];
                seating_position[row][column] = null;

                System.out.printf("Passenger %s at Row %d, Column %d has been Removed..%n", passenger, row, column);
            }
        }
    }

}