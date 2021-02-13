import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatReservationAppTest {

    @Test
    void testForSeatsToBeEmptyInitially() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();

        for (int row = 0; row < seatReservationApp.seats.length; ++row)
            for (int column = 0; column < seatReservationApp.seats[row].length; ++column)
                assertNull(seatReservationApp.seats[row][column]);
    }

    @Test
    void testForAddPassengerDetailsToSeatMethod() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "CA");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails());
        assertNotNull(seatReservationApp.seats[0][0]);
    }

    @Test
    void testForPassengerDetailsCantBeAddedToATakenSeat() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "CA");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails());

        passengersDetailsApp.addPassengerDetails("Olanrewaju", "Alawode", "NYC");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails());

        assertEquals(passengersDetailsApp.getPassengerDetails(), seatReservationApp.seats[0][1]);
    }

}