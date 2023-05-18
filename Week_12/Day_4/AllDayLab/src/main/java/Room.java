import java.util.ArrayList;

public abstract class Room {

    int capacity;
    ArrayList<Guest> listOfGuests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.listOfGuests = guests;
    }
}
