import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> listOfGuests;

    @Before
    public void before() {
        guest1 = new Guest("Paul");
        guest2 = new Guest("Claire");
        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest1);
        listOfGuests.add(guest2);
        conferenceRoom = new ConferenceRoom(13, listOfGuests, "Big room");
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(3, conferenceRoom.countOccupants() );
    }
}


