import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    String name;
    HashMap<Integer, Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, HashMap<Integer, Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public void checkInGuest(Room room, Guest guest){
        if (room.getCapacity() > room.countOccupants()) {
            if (room instanceof Bedroom && room.countOccupants() != 0){
                //do nothing
            } else {
                room.addGuest(guest);
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }

    public HashMap<Integer, Bedroom> findEmptyRooms(){
        HashMap<Integer, Bedroom> result = new HashMap<>();
        for( Bedroom bedroom : bedrooms.values()){
            if(bedroom.countOccupants() == 0){
                result.put(bedroom.getRoomNumber(), bedroom);
            }
        }
        return result;
    }
}
