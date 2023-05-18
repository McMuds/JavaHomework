import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Claire", 4);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Claire", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(4, passenger1.getNumberOfBags());
    }
}
