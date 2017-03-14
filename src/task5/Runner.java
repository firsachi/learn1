package task5;

import task5.databse.MainDao;
import task5.databse.MainDaoImpl;
import task5.entity.Room;

import java.util.Date;

/**
 * Created by firsov on 09.03.2017.
 */
public class Runner {

    public static void main(String[] args) {
        Controller controller = new Controller();
        view(controller, 23, 12, "Kyiv", "Hotel");
        view(controller, 99, 4,  "V", "l");
        view(controller, 12, 3,  "df", "m");

        MainDao mainDao = new MainDaoImpl();
        for (int i = 0; i < 6; i++){
            System.out.println(mainDao.save( new Room(1,23,12,new Date(10122017), "Hotel", "Kyiv" )).getId());
        }

        System.out.println(mainDao.findById(5).toString());
        System.out.println(mainDao.findById(1).toString());
        System.out.println(mainDao.findById(3).toString());

        Room room = mainDao.findById(6);
        room.setCityName("jfdlksjflj");
        System.out.println(mainDao.update(room));

        room = mainDao.findById(1);
        room.setCityName("a;kdf;lksd;kf");
        System.out.println(mainDao.update(room));

        room = mainDao.findById(1);
        room.setPerson(23);
        System.out.println(mainDao.update(room));

        mainDao.delete(mainDao.findById(1));
        mainDao.delete(mainDao.findById(1));
        mainDao.delete(mainDao.findById(1));
    }



    private static void view(Controller controller, int price, int person, String city, String hotel){
        for (Room room : controller.requstRooms(price, person, city, hotel)) {
            System.out.println(room.toString());
        }
    }
}

