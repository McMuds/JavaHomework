package NonPeople;
import People.Passenger;

import java.util.ArrayList;

public class FlightManager{

    public FlightManager(){}

    public static int calculateFlightPassengersBaggageWeight(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int runningTotal = 0;
        for (Passenger passenger : passengers){
            runningTotal += (passenger.getTypeOfBags().getBaggageWeight() *
                    passenger.getNumberOfBags());
        }
        return runningTotal;
    }
}
