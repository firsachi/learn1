package task6.utils;

import task6.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by firsov on 23.03.2017.
 */
public class UserUtils {

    public static User[] uniqueUsers(User[] users){
        User temp[] = deleteEmptyUsers(users);
        User result[] = new User[]{temp[0]};
        for (User user : temp){
            boolean flag = false;
            for(User user1 : result){
                if(user.equals(user1)){
                    flag = true;
                }
            }
            if(!flag){
                result = addElemntArry(result, user);
            }
        }
        return  result;
    }


    public  static User[] usersWithContitionalBalance(User[] users, int balance){
        User arrayUsers[] = new User[0];
        for (User user : users){
            if ( null != user && balance == user.getBalance()){
                arrayUsers = addElemntArry(arrayUsers, user);
            }
        }
        return arrayUsers;
    }

    private static User[] addElemntArry(User users[], User user){
        int size = users.length + 1;
        User arrayUsers[] = new User[size];
        System.arraycopy(users, 0, arrayUsers, 0, users.length);
        arrayUsers[size -1] = user;
        return  arrayUsers;
    }

    public  static User[]  paySalaryToUsers(User[] users){
        User userTmp[] = deleteEmptyUsers(users);
        int size = userTmp.length;
        for (int index = 0; index < size; index++){
            User tmpUser = userTmp[index];
            userTmp[index] = new User(tmpUser.getId(), tmpUser.getFirstName(), tmpUser.getLastName(), tmpUser.getSalary(), tmpUser.getBalance() + tmpUser.getSalary());
        }
        return userTmp;
    }

    public static long[] getUsersId(User[] users){
        User tmpUser[] = deleteEmptyUsers(users);
        int sizeArray = tmpUser.length;
        long idLong[] = new long[sizeArray];
        for (int index = 0; index < sizeArray; index++){
            idLong[index] = tmpUser[index].getId();
        }
        return  idLong;
    }

    public static User[] deleteEmptyUsers(User[] users){
        User tmp[] = users;
        Arrays.sort(tmp, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null) {
                    return 1;
                }
                if (o2 == null) {
                    return -1;
                }
                return 0;
            }
        });
        int size = tmp.length;
        int siseResultArrey = 0;
        for (int index = 0; index < size; index++){
            if (null == tmp[index]){
                siseResultArrey = index;
                break;
            }
        }
        User result[] =  new User[siseResultArrey];
        System.arraycopy(tmp, 0, result, 0, siseResultArrey);
        return result;
    }
}
