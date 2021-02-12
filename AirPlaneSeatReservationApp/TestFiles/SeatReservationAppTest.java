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
    void addPassengerDetailsToSeatMethod() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "CA");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails());
        assertNotNull(seatReservationApp.seats[0][0]);
    }

}