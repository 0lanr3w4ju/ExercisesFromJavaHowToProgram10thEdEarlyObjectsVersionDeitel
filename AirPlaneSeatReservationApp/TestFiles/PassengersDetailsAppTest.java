import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengersDetailsAppTest {

    @Test
    void testForAddedPassengerHasFirstName() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Olanrewaju", "Alawode", "NY");
        assertEquals("Olanrewaju", passengersDetailsApp.passenger.get("First Name"));
    }

    @Test
    void testForAddedPassengerHasLastName() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Olanrewaju", "Alawode", "NY");
        assertEquals("Alawode", passengersDetailsApp.passenger.get("Last Name"));
    }

    @Test
    void testForAddedPassengerHasDestination() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Olanrewaju", "Alawode", "NY");
        assertEquals("NY", passengersDetailsApp.passenger.get("Destination"));
    }

    @Test
    void testForGetPassengerDetailsMethod() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Olanrewaju", "Alawode", "NYC");
        assertNotNull(passengersDetailsApp.getPassengerDetails());
    }

}