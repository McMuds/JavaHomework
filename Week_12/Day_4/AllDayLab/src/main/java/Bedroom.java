import java.util.ArrayList;

public class Bedroom extends Room {
    RoomType roomType;
    int roomNumber;
    Double nightlyRate;

    public Bedroom(int roomNumber, ArrayList<Guest> guests, RoomType roomType, Double roomRate){
        super(roomType.getValue(), guests);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = roomRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Double getNightlyRate(){
        return nightlyRate;
    }

//    public int getCapacity(){
//        return this.getRoomType().getValue();
//    }
}
