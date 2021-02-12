package com.alpha.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeatReservationDriver {

    public static void main(String[] args) {

        SeatReservation seatReservation;
        seatReservation = new SeatReservation();

        Scanner scan = new Scanner(System.in);

        int option;
        do {
            // welcomes and provide interaction options to users
            System.out.print(seatReservation.welcomeUserAndProvideOptionsMethod());

            try { // try block to check if selected option is valid
                option = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid Input..");
                break;
            }

            if (option == 1) {
                String passengerFullName;
                do {
                    System.out.print("Enter Passenger's Full Name, Q to Quit: ");

                    try {
                        passengerFullName = scan.nextLine().toLowerCase();
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid Input..");
                        break;
                    }

                    if (passengerFullName.length() > 0) {
                        if (!passengerFullName.equals("q".toLowerCase())) {
                            seatReservation.addPassengerToSeat(passengerFullName);
                        }
                    }
                } while (!passengerFullName.equals("q"));
            }

            if (option == 2) {
                System.out.print("""
                        1 : to List Seats (Occupied and Non-Occupied)
                        2 : to Remove Passenger from Seat
                        3 : to go back
                        > """);

                int choice;
                try {
                    choice = scan.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.println("Invalid Input..");
                    break;
                }

                do {
                    if (choice == 1) {
                        seatReservation.getNamesFromSeat();
                        choice = 3;
                    } else if (choice == 2) {
                        System.out.print("enter Row: ");
                        int row;
                        try {
                            row = scan.nextInt();
                        } catch (InputMismatchException exception) {
                            System.out.println("Invalid Input..");
                            break;
                        }
                        System.out.print("enter Column: ");
                        int column;
                        try {
                            column = scan.nextInt();
                        } catch (InputMismatchException exception) {
                            System.out.println("Invalid Input..");
                            break;
                        }
                        seatReservation.removePassengerFromSeat(row, column);
                        break;
                    }
                } while (choice != 3);
            }
//            seatReservation.moveFromWaitingListToSeatPositionsIfVacant();
        } while (option != 3);
    }

}
