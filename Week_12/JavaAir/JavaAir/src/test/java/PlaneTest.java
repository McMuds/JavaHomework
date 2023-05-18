import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane747;
    Plane plane737;
    Plane planeCessna;

    @Before
    public void before(){
        plane747 = new Plane(PlaneType.BOEING747);
        plane737 = new Plane(PlaneType.BOEING737);
        planeCessna = new Plane(PlaneType.CESSNA);
    }
    @Test
    public void planeHasPassengerCapacity(){
        assertEquals(2, planeCessna.getPassengerCapacityFromEnum());
    }
    @Test
    public void planeHasWeightLimity(){
        assertEquals(5, planeCessna.getBaggageCapacityFromEnum());
    }
}
