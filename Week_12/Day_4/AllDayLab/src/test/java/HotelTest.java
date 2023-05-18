import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest;
    private ArrayList<Guest> listOfGuests1;
    private ArrayList<Guest> listOfGuests2;
    private Hotel ourHotel;
    private HashMap<Integer, Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;

    @Before
    public void before(){
        guest = new Guest("Mar");
        listOfGuests1 = new ArrayList<>();
        listOfGuests2 = new ArrayList<>();
        bedroom1 = new Bedroom(13, listOfGuests1, RoomType.SINGLE, 60.0);
        bedroom2 = new Bedroom(3, listOfGuests2, RoomType.SINGLE, 60.0);
//        booking = new Booking(bedroom1, 4);
        listOfBedrooms = new HashMap<>();
        listOfConferenceRooms = new ArrayList<>();
        listOfBedrooms.put(bedroom1.getRoomNumber(), bedroom1);
        listOfBedrooms.put(bedroom2.getRoomNumber(), bedroom2);
        ourHotel = new Hotel("The Ritz", listOfBedrooms, listOfConferenceRooms);
    }

    @Test
    public void canFindOnlyEmptyRooms(){
        //Arrange
        ourHotel.checkInGuest(bedroom1, guest);
        //Act
        assertEquals(1, ourHotel.findEmptyRooms().size());
        assertEquals(bedroom2, ourHotel.findEmptyRooms().get(bedroom2.getRoomNumber()));
    }

}
