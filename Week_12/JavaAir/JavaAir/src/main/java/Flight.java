import People.CabinCrew;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departingFrom;
    private String departureTime;
    private Pilot pilot;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrewList, Plane plane,
                  String flightNumber, Airport dest, Airport departure, String departureTime){
        this.pilots = pilots;
        this.cabinCrewList = cabinCrewList;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = dest;
        this.departingFrom = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }
    public ArrayList<CabinCrew> getCabinCrewList() {
        return cabinCrewList;
    }
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public int getPassengerCount(){
        return passengers.size();
    }
    public Plane getPlane() {
        return plane;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public Airport getDestination() {
        return destination;
    }
    public Airport getDepartingFrom() {
        return departingFrom;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void addPassengers(Passenger passenger) {
        if (flightHasCapacity()) {
            this.passengers.add(passenger);
        }
    }
    public Boolean flightHasCapacity(){
        return (getAvailableSeatCount() > 0);
    }

    public int getAvailableSeatCount(){
        return getPlane().getPassengerCapacityFromEnum() - getPassengerCount();
    }
}
