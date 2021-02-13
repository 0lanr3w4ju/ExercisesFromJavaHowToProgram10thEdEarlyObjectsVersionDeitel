public class SeatReservationApp {

    public String[][] seats = new String[6][6];

    private int row = 0;
    private int column = 0;

    public void addPassengerDetailsToSeat(String passengerDetails) {
        if (seats[row][column] == null) {
            seats[row][column] = passengerDetails;
        } else {
            column++;
            try {
                seats[row][column] = passengerDetails;
            } catch (ArrayIndexOutOfBoundsException e) {
                if (row != 5) {
                    column = 0;
                    row++;
                }
                try {
                    seats[row][column] = passengerDetails;
                } catch (ArrayIndexOutOfBoundsException e1) {
                    System.out.println("We are Booked..");
                }
            }
        }
    }
}
