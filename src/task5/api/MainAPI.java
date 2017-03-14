package task5.api;

import task5.entity.Room;

/**
 * Created by firsov on 09.03.2017.
 */
public interface MainAPI {

    Room[] findRooms(int price, int persons, String city, String hotel);
}
