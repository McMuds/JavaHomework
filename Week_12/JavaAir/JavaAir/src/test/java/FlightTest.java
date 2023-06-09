import Enums.BaggageType;
import NonPeople.Airport;
import NonPeople.Flight;
import NonPeople.Plane;
import Enums.PlaneType;
import People.CabinCrew;
import People.Passenger;
import Enums.RankType;
import People.Pilot;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlightTest {

    private Flight cessnaFlight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrew> cabinCrew;


    @Before
    public void before(){
        Pilot pilot = new Pilot("Sully", RankType.CAPTAIN, "980103GB73");
        pilots = new ArrayList<>();
        pilots.add(pilot);
        CabinCrew cc1 = new CabinCrew("Polly", RankType.PURSER);
        CabinCrew cc2 = new CabinCrew("Samuel", RankType.FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(cc1);
        cabinCrew.add(cc2);
        Plane cessnaPlane = new Plane(PlaneType.CESSNA);
        cessnaFlight = new Flight(pilots, cabinCrew, cessnaPlane, "EZY313",
                Airport.EDI, Airport.IOM, LocalTime.of(9, 0, 0));
        passenger1 = new Passenger("Claire", 2, BaggageType.SMALL);
        passenger2 = new Passenger("Fiona", 2, BaggageType.MEDIUM);
        passenger3 = new Passenger("Johan", 1, BaggageType.OVERSIZE);
        passenger4 = new Passenger("Margaret", 0, BaggageType.NONE);
    }

    @Test
    public void canGetPassengerCapacity_empty(){
        assertEquals(2, cessnaFlight.getPlane().getPassengerCapacityFromEnum());
    }
    @Test
    public void canGetBagCapacity_empty(){
        assertEquals(10, cessnaFlight.getPlane().getBaggageCapacityFromEnum());
    }
    @Test
    public void canGetCountOfPassengers_partial(){
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
        cessnaFlight.addPassengers(passenger4);
        assertEquals(false, cessnaFlight.flightHasCapacity());
    }
    @Test
    public void canBookFlight(){
        cessnaFlight.addPassengers(passenger1);
        assertEquals(1, cessnaFlight.getPassengerCount());
        assertEquals("Claire", cessnaFlight.getPassengers().get(0).getName());
    }
    //    @Test
//    public void createFlightWithNoPilot_fail(){
//        NonPeople.Plane cessnaPlane = new NonPeople.Plane(Enums.PlaneType.CESSNA);
//        cessnaFlight = new NonPeople.Flight(null, cabinCrew, cessnaPlane, "EZY313",
//                NonPeople.Airport.EDI, NonPeople.Airport.IOM, "09:00");
//        assertEquals("EZY313", cessnaFlight.getFlightNumber());
//    }
    @Test
    public void flightCanReturnAvailableSeats_empty(){
        assertEquals(2,cessnaFlight.getAvailableSeatCount());
    }
    @Test
    public void flightCanReturnAvailableSeats(){
        cessnaFlight.addPassengers(passenger1);
        assertEquals(1,cessnaFlight.getAvailableSeatCount());
    }
    @Test
    public void flightCanReturnAvailableSeats_full(){
        cessnaFlight.addPassengers(passenger1);
        cessnaFlight.addPassengers(passenger4);
        assertEquals(0,cessnaFlight.getAvailableSeatCount());
    }
    @Test
    public void cannotOverbookFlight(){
        cessnaFlight.addPassengers(passenger1);
        cessnaFlight.addPassengers(passenger4);
        cessnaFlight.addPassengers(passenger3);
        assertEquals(false, cessnaFlight.flightHasCapacity());
        assertEquals(2, cessnaFlight.getPassengerCount());
        assertEquals("Claire", cessnaFlight.getPassengers().get(0).getName());
        assertEquals("Margaret", cessnaFlight.getPassengers().get(1).getName());
    }
    @Test
    public void passengerHasFlightObject(){
        cessnaFlight.addPassengers(passenger1);
        assertEquals("EZY313", passenger1.getFlight().getFlightNumber());
    }
    @Test
    public void passengerHasSeatNumber(){
        cessnaFlight.addPassengers(passenger4);
        int result = passenger4.getSeatNumber();
        assertEquals(1, (result / result));
    }

    @Test
    public void passengersHaveDifferentSeatNumbers(){
//        System.out.println("Randomiser Test from here on:"); //for testing
        Plane bigPlane = new Plane(PlaneType.FOURSEATER);
        cessnaFlight = new Flight(pilots, cabinCrew, bigPlane, "EZY313",
                Airport.EDI, Airport.IOM, LocalTime.of(9, 0, 0));
        cessnaFlight.addPassengers(passenger1);
        cessnaFlight.addPassengers(passenger2);
        cessnaFlight.addPassengers(passenger3);
        cessnaFlight.addPassengers(passenger4);
        assertNotEquals(passenger1.getSeatNumber(),passenger4.getSeatNumber());
        assertNotEquals(passenger1.getSeatNumber(),passenger3.getSeatNumber());
        assertNotEquals(passenger1.getSeatNumber(),passenger2.getSeatNumber());
        assertNotEquals(passenger2.getSeatNumber(),passenger3.getSeatNumber());
        assertNotEquals(passenger2.getSeatNumber(),passenger4.getSeatNumber());
        assertNotEquals(passenger3.getSeatNumber(),passenger4.getSeatNumber());
//        System.out.println("Randomiser Test ends:"); //for testing
    }
}
