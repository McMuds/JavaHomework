import java.util.ArrayList;

public class ConferenceRoom extends Room {

    String name;

    public ConferenceRoom(int capacity, ArrayList<Guest>listOfGuests, String name){
        super(capacity, listOfGuests);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
