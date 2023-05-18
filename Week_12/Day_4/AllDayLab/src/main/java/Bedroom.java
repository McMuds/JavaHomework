import java.util.ArrayList;

public class Bedroom extends Room{
    RoomType roomType;
    int roomNumber;

    public Bedroom(int roomNumber, ArrayList<Guest> guests, RoomType roomType){
        super(roomType.getValue(), guests);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

//    public int getCapacity(){
//        return this.getRoomType().getValue();
//    }
}
