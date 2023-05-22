package Enums;

public enum PlaneType {
    BOEING747(80, 80),
    BOEING737(15,50),
    CESSNA(2,10),
    FOURSEATER(4,80);


    private final int passengerCapacity;
    private final int baggageWeightLimit;

    PlaneType(int passengerCapacity, int baggageWeightLimit){
        this.passengerCapacity = passengerCapacity;
        this.baggageWeightLimit = baggageWeightLimit;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getBaggageWeightLimit(){
        return baggageWeightLimit;
    }

}
