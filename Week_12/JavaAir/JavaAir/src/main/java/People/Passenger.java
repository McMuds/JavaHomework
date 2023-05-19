package People;

import Enums.BaggageType;

public class Passenger extends Person{
    private int numberOfBags;
    private BaggageType typeOfBags;

    public Passenger(String passengerName, int bagCount, BaggageType typeOfBag){
        super(passengerName);
        this.numberOfBags = bagCount;
        this.typeOfBags = typeOfBag;
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
}
