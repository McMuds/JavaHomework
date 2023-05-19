import People.RankType;
import People.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot1;
    private Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("Sully", RankType.CAPTAIN, "9300104GB67");
    }
    @Test
    public void pilotHasName(){
        assertEquals("Sully", pilot1.getName());
    }
    @Test
    public void pilotHasLicenceNumber() {
        assertEquals("9300104GB67", pilot1.getLicenceNumber());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Wheeee!!! Look ma - no hands!", pilot1.flyThePlane());
    }
}
