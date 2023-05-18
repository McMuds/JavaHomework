import People.CabinCrew;
import People.RankType;
import People.Pilot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight cessnaFlight;

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
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(2, cessnaFlight.getPlane().getPassengerCapacityFromEnum());
    }
}
