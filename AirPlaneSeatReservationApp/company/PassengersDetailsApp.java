import java.util.HashMap;

public class PassengersDetailsApp {

    HashMap<String, String> passenger; // declaration for hashmap

    public void addPassengerDetails(String firstName, String lastName, String destination) {
        passenger = new HashMap<>();

        passenger.put("First Name", firstName.toUpperCase());
        passenger.put("Last Name", lastName.toUpperCase());
        passenger.put("Destination", destination.toUpperCase());
    }

    public String getPassengerDetails() {
        return String.valueOf(passenger);
    }

}
