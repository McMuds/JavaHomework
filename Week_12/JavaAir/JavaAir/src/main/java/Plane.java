public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getPassengerCapacityFromEnum(){
        return this.planeType.getPassengerCapacity();
    }

    public int getBaggageCapacityFromEnum(){
        return this.planeType.getBaggageWeightLimit();
    }
}
