public enum PlaneType {
    BOEING747(30, 50),
    BOEING737(15,30),
    CESSNA(2,5);

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
