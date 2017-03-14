package task5.databse;

import task5.entity.Room;

/**
 * Created by firsov on 14.03.2017.
 */
public class MainDaoImpl implements MainDao {

    private int size = 5;
    private Room rooms[] = new Room[size];
    private int filling = 0;

    @Override
    public Room save(Room room) {
        if(filling < size ){
            rooms[filling] = room;
            filling++;
        }else{
            size = size + size;
            Room array[] = new Room[size];
            System.arraycopy(rooms, 0, array, 0, rooms.length);
            rooms = array;
            rooms[filling] = room;
            filling++;
        }
        room.setId(filling);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int index = 0; index < filling; index++ ) {
            if (room.getId() == rooms[index].getId()){
                rooms[index] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int index = 0; index < filling; index++ ) {
            if (room.getId() == rooms[index].getId()){
                rooms[index] = room;
                break;
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (int index = 0; index < filling; index++ ) {
            if (id == rooms[index].getId()){
                return rooms[index];
            }
        }
        return null;
    }
}
