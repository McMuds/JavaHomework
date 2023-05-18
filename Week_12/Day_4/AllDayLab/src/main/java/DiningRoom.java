import java.util.ArrayList;

public class DiningRoom extends Room{

    private String name;

    public DiningRoom(String name, int capacity, ArrayList<Guest> listOfGuests){
        super(capacity,listOfGuests);
        this.name = name;
    }


}
