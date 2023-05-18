import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Guest guest1;
    private Guest guest2;
    private Bedroom bedroom1;

    @Before
    public void before(){
        guest1 = new Guest("Paul");
        guest2 = new Guest("Claire");
        ArrayList<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(guest1);
        listOfGuests.add(guest2);
        bedroom1 = new Bedroom(13, listOfGuests, RoomType.DOUBLE, 50.00) ;
    }

    @Test
    public void bedroomHasNumber(){
        assertEquals(13, bedroom1.getRoomNumber());
    }

    @Test
    public void bedroomHasCorrectCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void canAddGuest(){
        ArrayList<Guest> listOfGuests = new ArrayList<>();
        Bedroom bedroom2 = new Bedroom(13, listOfGuests, RoomType.DOUBLE, 60.00);
        bedroom2.addGuest(guest1);
        assertEquals(1, bedroom2.countOccupants() );
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(50.00, bedroom1.getNightlyRate(), 0.0);
    }
    }