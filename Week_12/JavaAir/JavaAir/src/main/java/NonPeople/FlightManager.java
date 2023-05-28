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
//        int runningTotal = passengers.stream()
//                .reduce(0,(accum, weight) -> accum + getPassengerWeightNeeds(pass))

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

    public static Boolean decideIfPassengerCanFit(Flight flight, Passenger passenger){
        return getRemainingBaggageAllowance(flight) >= getPassengerWeightNeeds(passenger);
    }
}
