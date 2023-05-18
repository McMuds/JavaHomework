import java.util.ArrayList;

public class Hotel {
    String name;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public void checkInGuest(Room room, Guest guest){
        if (room instanceof Bedroom){
            Bedroom bedroom = (Bedroom) room;
            bedroom.addGuest(guest);
        } else {
            if (room instanceof ConferenceRoom){
                ConferenceRoom conferenceRoom = (ConferenceRoom) room;
                conferenceRoom.addGuest(guest);
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }
}
