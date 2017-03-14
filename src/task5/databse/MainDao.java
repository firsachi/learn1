package task5.databse;

import task5.entity.Room;

/**
 * Created by firsov on 14.03.2017.
 */
public interface MainDao {

    public Room save(Room room);
    public boolean delete(Room room);
    public Room update(Room room);
    public Room findById(long id);
}
