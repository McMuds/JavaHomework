package Rooms;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> listOfGuests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.listOfGuests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest){
        listOfGuests.add(guest);
    }

    public void removeGuest(Guest guest){
        listOfGuests.remove(guest);
    }

    public int countOccupants(){
        return listOfGuests.size();
    }

}
