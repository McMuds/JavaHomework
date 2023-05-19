import Enums.BaggageType;
import Enums.PlaneType;
import NonPeople.Airport;
import NonPeople.Flight;
import NonPeople.FlightManager;
import NonPeople.Plane;
import People.Passenger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Claire", 2, BaggageType.SMALL);
        passenger2 = new Passenger("Fiona", 1, BaggageType.MEDIUM);
        passenger3 = new Passenger("Karen", 2, BaggageType.XLARGE);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(null, null, plane, "EZY432",
                Airport.EDI, Airport.LHR, "08:00");
    }

    @Test
    public void testStaticFlightBaggageWeight(){
        flight.addPassengers(passenger1);
        assertEquals(8, FlightManager.calculateFlightPassengersBaggageWeight(flight));
    }
}
