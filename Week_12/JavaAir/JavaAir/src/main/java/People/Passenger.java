package People;

public class Passenger extends Person{
    private int numberOfBags;

    public Passenger(String passengerName, int bagCount){
        super(passengerName);
        this.numberOfBags = bagCount;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
