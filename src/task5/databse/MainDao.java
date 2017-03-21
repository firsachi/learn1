package task5.databse;

import task5.entity.Room;

/**
 * Created by firsov on 14.03.2017.
 */
public interface MainDao {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
