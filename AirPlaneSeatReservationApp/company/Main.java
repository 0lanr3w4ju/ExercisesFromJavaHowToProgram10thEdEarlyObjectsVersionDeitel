public class Main {

    public static void main(String[] args) {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
//        SeatReservationApp seatReservationApp = new SeatReservationApp();
        WaitingList waitingList = new WaitingList();

        passengersDetailsApp.addPassengerDetails("Glory", "Aji", "US");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());

        passengersDetailsApp.addPassengerDetails("Blessing", "Aji", "NE");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());

        passengersDetailsApp.addPassengerDetails("Mama", "Aji", "US");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());

        waitingList.getPassengersOnWaitingList();
    }

}
