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

}
