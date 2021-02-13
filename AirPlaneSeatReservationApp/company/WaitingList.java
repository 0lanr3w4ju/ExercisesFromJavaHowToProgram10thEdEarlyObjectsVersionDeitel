public class WaitingList {

    // this array is used as a waiting list just in case plane seats
    // are booked.
    // I will be using a dynamic array for this, since we dont know the
    // exact number of passengers who will be on the waiting list.

    String[] theWaitList;
    private int count;
    private int sizeOfList;

    public WaitingList() { // constructor
        this.theWaitList = new String[1];
        this.count = 0;
        this.sizeOfList = 1;
    }

    public void addPassengerToWaitList(String passengerDetail) {
        if (count == sizeOfList) {
            growListSize();
        }

        theWaitList[count] = passengerDetail;
        count++;
        shrinkListSize();
    }

    private void growListSize() {
        String[] temp = new String[0];

        if (count == sizeOfList) {
            temp = new String[sizeOfList * 2]; // initializes the new array
        }

        // copies on to the new array from the old array
        if (sizeOfList >= 0) System.arraycopy(theWaitList, 0, temp, 0, sizeOfList);

        theWaitList = temp; // old array becomes new array
        sizeOfList *= 2;
    }

    private void shrinkListSize() {
        String[] temp;

        if (count > 0) {
            temp = new String[count];

            System.arraycopy(theWaitList, 0, temp, 0, count);
            sizeOfList = count;
            theWaitList = temp;
        }
    }

    public void getPassengersOnWaitingList() {
        for (String passengers:
             theWaitList) {
            System.out.println(passengers);
        }
    }

}
