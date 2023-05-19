package People;

import Enums.BaggageType;
import NonPeople.Flight;

public class Passenger extends Person{
    private int numberOfBags;
    private BaggageType typeOfBags;
    private Flight flight;

    public Passenger(String passengerName, int bagCount, BaggageType typeOfBag){
        super(passengerName);
        this.numberOfBags = bagCount;
        this.typeOfBags = typeOfBag;
        this.flight = null;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
    public BaggageType getTypeOfBags() {
        return typeOfBags;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
