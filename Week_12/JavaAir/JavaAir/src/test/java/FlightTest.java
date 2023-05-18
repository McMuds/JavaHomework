import People.CabinCrew;
import People.Passenger;
import People.RankType;
import People.Pilot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight cessnaFlight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before(){
        Pilot pilot = new Pilot("Sully", RankType.CAPTAIN, "980103GB73");
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot);
        CabinCrew cc1 = new CabinCrew("Polly", RankType.PURSER);
        CabinCrew cc2 = new CabinCrew("Samuel", RankType.FLIGHT_ATTENDANT);
        ArrayList<CabinCrew> cabinCrew = new ArrayList<>();
        cabinCrew.add(cc1);
        cabinCrew.add(cc2);
        Plane cessnaPlane = new Plane(PlaneType.CESSNA);
        cessnaFlight = new Flight(pilots, cabinCrew, cessnaPlane, "EZY313",
                Airport.EDI, Airport.IOM, "09:00");
        passenger1 = new Passenger("Claire", 3);
        passenger2 = new Passenger("Fiona", 2);
        passenger3 = new Passenger("Johan", 1);
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(2, cessnaFlight.getPlane().getPassengerCapacityFromEnum());
    }
    @Test
    public void canGetBagCapacity(){
        assertEquals(5, cessnaFlight.getPlane().getBaggageCapacityFromEnum());
    }
    @Test
    public void canGetCountOfPassengers(){
        cessnaFlight.addPassengers(passenger1);
        assertEquals(1, cessnaFlight.getPassengerCount());
    }
    @Test
    public void flightHasCapacity_Pass(){
        cessnaFlight.addPassengers(passenger2);
        assertEquals(true, cessnaFlight.flightHasCapacity());
    }
    @Test
    public void flightHasCapacity_Fail(){
        cessnaFlight.addPassengers(passenger1);
        cessnaFlight.addPassengers(passenger3);
        assertEquals(false, cessnaFlight.flightHasCapacity());
    }
}
