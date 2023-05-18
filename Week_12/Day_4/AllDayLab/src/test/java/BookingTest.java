import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Guest guest;
    ArrayList<Guest> listOfGuests;
    Hotel ourHotel;
    HashMap<Integer, Bedroom> listOfBedrooms;
    ArrayList<ConferenceRoom> listOfConferenceRooms;

    @Before
    public void before(){
        guest = new Guest("Mar");
        listOfGuests = new ArrayList<>();
//        listOfGuests.add(guest);
        bedroom = new Bedroom(13, listOfGuests, RoomType.SINGLE, 60.0);
        booking = new Booking(bedroom, 4);
        listOfBedrooms = new HashMap<>();
        listOfConferenceRooms = new ArrayList<>();
        listOfBedrooms.put(bedroom.getRoomNumber(), bedroom);
        ourHotel = new Hotel("The Ritz", listOfBedrooms, listOfConferenceRooms);
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(4, booking.getNumOfNights());
    }

    @Test
    public void canBookRoom(){
        Assert.assertTrue(ourHotel.bookRoom(bedroom, 5) instanceof Booking);
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(240.0, booking.getTotalBill(), 0.0);
    }
}
