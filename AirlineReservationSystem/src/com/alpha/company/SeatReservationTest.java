package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatReservationTest {

    @Test
    void checkIfSeatsAreEmpty() {
        SeatReservation seatReservation = new SeatReservation();
        for (int row = 0; row < seatReservation.seating_position.length; row++) {
//            seatReservation.setNameToSeat(0,0, "Alawode Olanrewaju"); // <-- to check if null is really null
            for (int column = 0; column < seatReservation.seating_position[row].length; column++) {
                assertNull(seatReservation.seating_position[row][column]);
            }
        }
    }

    @Test
    void checkIfWaitingListIsEmpty() {
        SeatReservation seatReservation = new SeatReservation();
        for (int row = 0; row < seatReservation.waiting_list.length; row++) {
                assertNull(seatReservation.waiting_list[row]);
        }
    }

    @Test
    void addPassengerToSeat() {
        SeatReservation seatReservation = new SeatReservation();
        seatReservation.addPassengerToSeat("Olanrewaju");
//        seatReservation.addPassengerToSeat("Lanre"); <-- to test index of array incremented
        for (int row = 0; row < seatReservation.seating_position.length; row++) {
            for (int column = 0; column < seatReservation.seating_position[row].length; column++) {
                assertNotNull(seatReservation.seating_position[row][column]);
            }
        }
    }

//    @Test
//    void setNameToATakenSeat() {
//        SeatReservation seatReservation = new SeatReservation();
//        seatReservation.addPassengerToSeat(0,0, "Alawode Olanrewaju");
//        seatReservation.addPassengerToSeat(0,0, "Odiri Ovie");
//        assertEquals("Alawode Olanrewaju", seatReservation.getNameFromSeat(0,0));
//    }

    @Test
    void getNameFromSeats() {
        SeatReservation seatReservation = new SeatReservation();
        for (int row = 0; row < seatReservation.seating_position.length; row++) {
            for (int column = 0; column < seatReservation.seating_position[row].length; column++) {
                assertNull(seatReservation.seating_position[row][column]);
            }
        }
    }

    @Test
    void returnAMessageThatWelcomesUsers() {
        SeatReservation seatReservation = new SeatReservation();
        String report;
        report = seatReservation.welcomeUserAndProvideOptionsMethod();
        assertNotNull(report);
    }

    @Test
    void removesPassengerFromSeat() {
        SeatReservation seatReservation = new SeatReservation();
        seatReservation.addPassengerToSeat("OnaBisi OnaBanjo");
//        seatReservation.addPassengerToSeat("OnaOnaBanjo"); <-- just to prove my point
        seatReservation.removePassengerFromSeat(0,0);
//        seatReservation.removePassengerFromSeat(0,1); <-- just to prove my point
        for (int row = 0; row < seatReservation.seating_position.length; row++) {
            for (int column = 0; column < seatReservation.seating_position[row].length; column++) {
                assertNull(seatReservation.seating_position[row][column]);
            }
        }
    }
}