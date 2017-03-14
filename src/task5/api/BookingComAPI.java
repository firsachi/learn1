package task5.api;

import task5.entity.Room;
import task5.utils.CompareRoom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by firsov on 09.03.2017.
 */
public class BookingComAPI implements MainAPI {

    private Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1,23,12,new Date(10122017), "Hotel", "Kyiv" );
        rooms[1] = new Room(2, 1, 13, new Date(10122017), "Hotel13", "Lviv");
        rooms[2] = new Room(3, 13, 4, new Date(01012016), "hos", "Mos");
        rooms[3] = new Room(4, 99, 4, new Date(01012016), "l", "V");
        rooms[4] = new Room(5, 12, 3, new Date(01012015), "val", "df");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> list = new ArrayList<Room>();
        CompareRoom compareRoom = new CompareRoom();
        for ( Room room : rooms){
            if( compareRoom.compareTo(room, price, persons, city, hotel)){
                list.add(room);
            }
        }
        Room[] result = new Room[list.size()];
        for (int index = 0 ; index < list.size(); index++){
            result[index] = list.get(index);
        }
        return result;
    }
}
