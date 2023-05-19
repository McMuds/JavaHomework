import People.CabinCrew;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew purser1;
    CabinCrew flight_attendant;

    @Before
    public void before(){
        purser1 = new CabinCrew("Polly Purser", RankType.PURSER);
        flight_attendant = new CabinCrew("Sam Mitchell", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void ccHasName(){
        assertEquals("Polly Purser", purser1.getName());
    }

    @Test
    public void ccHasType(){
        assertEquals(RankType.PURSER, purser1.getRank());
    }

    @Test
    public void ccCanRelayMessage_populated(){
        assertEquals("Here is a message: Hello!", purser1.relayMessage("Hello!"));
    }
    @Test
    public void ccCanRelayMessage_empty(){
        assertEquals("Here is a message: ", purser1.relayMessage(""));
    }
    @Test
    public void ccCanRelayMessage_null(){
        assertEquals("Here is a message: ", purser1.relayMessage(null));
    }
}
