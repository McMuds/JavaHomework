import Rooms.Bedroom;

public class Booking {
    private Bedroom bedroom;
    private int numOfNights;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.numOfNights = nightsBooked;
    }

    public int getNumOfNights(){
        return this.numOfNights;
    }

    public Double getTotalBill(){
        return numOfNights * bedroom.getNightlyRate();
    }
}
