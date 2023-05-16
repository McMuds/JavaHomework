import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void waterBottleHasVolume(){
        assertEquals(100.0, waterBottle.getVolume(),0.0);
    }

    @Test
    public void drinkReducesBy10(){
        waterBottle.drink();
        assertEquals(90.0, waterBottle.getVolume(), 0.0);
        waterBottle.drink();
        assertEquals(80.0, waterBottle.getVolume(), 0.0);
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0.0, waterBottle.getVolume(), 0.0);
    }
    @Test
    public void canFillBottle(){
        waterBottle.fillBottle();
        assertEquals(100.0, waterBottle.getVolume(), 0.0);
    }
}
