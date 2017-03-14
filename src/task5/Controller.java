package task5;

import task5.api.BookingComAPI;
import task5.api.GoogleAPI;
import task5.api.MainAPI;
import task5.api.TripAdvisorAPI;
import task5.entity.Room;
import task5.utils.ResizeArrayRoom;

/**
 * Created by firsov on 14.03.2017.
 */
public class Controller {

    private MainAPI apis[] = new MainAPI[3];

    public Controller() {
        apis[0] = new TripAdvisorAPI();
        apis[1] = new BookingComAPI();
        apis[2] = new GoogleAPI();
    }


    public Room[] requstRooms(int price, int persons, String city, String hotel){
        Room result[] = new Room[0];
        for (MainAPI value : apis){
            Room tmp[] = value.findRooms(price, persons, city, hotel);
            result = new ResizeArrayRoom(result).addValue(tmp);
        }
        return result;
    }

    public Room[] check(MainAPI api1, MainAPI api2){
        return new Room[0];
    }
}
