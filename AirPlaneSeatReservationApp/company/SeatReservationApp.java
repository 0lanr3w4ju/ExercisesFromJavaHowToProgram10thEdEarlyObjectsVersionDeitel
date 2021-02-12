public class SeatReservationApp {

    String[][] seats = new String[6][6];

    public void addPassengerDetailsToSeat(String passengerDetails) {
        int row = 0, column = 0; // local variables

        if (seats[row][column] == null) {
            seats[row][column] = passengerDetails;
        }
    }

}
