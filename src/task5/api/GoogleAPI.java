package task5.api;

import task5.entity.Room;
import task5.utils.CompareRoom;
import task5.utils.ResizeArrayRoom;

import java.util.Date;

/**
 * Created by firsov on 14.03.2017.
 */
public class GoogleAPI implements MainAPI {

    private Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1,23,12, new Date(10122017), "Hotel", "Kyiv" );
        rooms[1] = new Room(2, 1, 13, new Date(10122017), "H", "Lviv");
        rooms[2] = new Room(3, 13, 4, new Date(01012016), "b", "Mos");
        rooms[3] = new Room(4, 99, 4, new Date(01012016), "l", "V");
        rooms[4] = new Room(5, 12, 3, new Date(01012015), "m", "df");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room resultRooms[] = new Room[0];
        CompareRoom compareRoom = new CompareRoom();
        for (Room room : rooms){
            if( compareRoom.compareTo(room, price, persons, city, hotel)){
                resultRooms = new ResizeArrayRoom(resultRooms).addValue(room);
            }
        }
        return resultRooms;
    }
}
