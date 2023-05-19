package NonPeople;

import People.CabinCrew;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;
import java.time.LocalTime;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departingFrom;
    private LocalTime departureTime;
    private Pilot pilot;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrewList, Plane plane,
                  String flightNumber, Airport dest, Airport departure, LocalTime departureTime){
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
    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    public void addPassengers(Passenger passenger) {
        if (flightHasCapacity() && FlightManager.decideIfPassengerCanFit(this, passenger)) {
            this.passengers.add(passenger);
            passenger.setFlight(this);
            passenger.setSeatNumber(getRandomSeatNumber());
        }
    }
    public Boolean flightHasCapacity(){
        return (getAvailableSeatCount() > 0);
    }
    public int getAvailableSeatCount(){
        return getPlane().getPassengerCapacityFromEnum() - getPassengerCount();
    }

    public int getRandomSeatNumber(){
        int numberOfSeats = this.getPlane().getPassengerCapacityFromEnum();
        int seatNumber;
        seatNumber = (int) (Math.random() * (numberOfSeats + 1));
        return seatNumber;
    }
}
