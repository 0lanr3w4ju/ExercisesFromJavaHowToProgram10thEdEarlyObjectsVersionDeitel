import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaitingListTest {

    @Test
    void addPassengerToWaitList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "US");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        assertNotNull(waitingList.theWaitList[0]);
    }

    @Test
    void getPassengersOnWaitingList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "US");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        waitingList.getPassengersOnWaitingList(); // it works if it prints
    }
}