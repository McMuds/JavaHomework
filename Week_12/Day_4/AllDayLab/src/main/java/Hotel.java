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
//        if (room instanceof Bedroom){
//            Bedroom bedroom = (Bedroom) room;
//            bedroom.addGuest(guest);
//        } else {
//            if (room instanceof ConferenceRoom){
//                ConferenceRoom conferenceRoom = (ConferenceRoom) room;
//                conferenceRoom.addGuest(guest);
//            }
//        }
        room.addGuest(guest);

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
