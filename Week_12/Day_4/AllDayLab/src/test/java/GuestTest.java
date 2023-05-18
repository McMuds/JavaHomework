import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Paul");
        guest2 = new Guest("Claire");
    }

    @Test
    public void guestHasName(){
        assertEquals("Paul", guest1.getName());
    }
}
