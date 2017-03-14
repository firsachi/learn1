package task5.utils;

import task5.entity.Room;

/**
 * Created by firsov on 09.03.2017.
 */
public class CompareRoom {

    public boolean compareTo(Room room, int price, int persons, String city, String hotel) {
        if(room.getPrice() == price && room.getPerson() == persons && city.equals(room.getCityName()) && hotel.equals(room.getHotelName())){
            return true;
        }else {
            return false;
        }
    }
}
