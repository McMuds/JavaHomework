package NonPeople;
import People.Passenger;

import java.util.ArrayList;

public class FlightManager{

    public FlightManager(){}

    public static int calculateFlightPassengersBaggageWeight(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int runningTotal = 0;
        for (Passenger passenger : passengers){
            runningTotal += getPassengerWeightNeeds(passenger);
        }
        return runningTotal;
    }

    public static int getPassengerWeightNeeds(Passenger passenger){
        return passenger.getTypeOfBags().getBaggageWeight()
                * passenger.getNumberOfBags();
    }

    public static int getRemainingBaggageAllowance(Flight flight){
        return flight.getPlane().getBaggageCapacityFromEnum()
                - calculateFlightPassengersBaggageWeight(flight);
    }
}
