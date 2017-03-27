package task6;

import task6.utils.UserUtils;

import java.util.Arrays;

/**
 * Created by firsov on 27.03.2017.
 */
public class UsersMain {

    public static void main(String[] args) {
        User users[] = new User[7];
        users[3] = new User(1, "Dmirtiy", "Donskoy", 100, 2000);
        users[1] = new User(2, "Vlodimir", "Lipinskiy", 150, 1500);
        users[5] = new User(2, "Vlodimir", "Lipinskiy", 150, 1500);

        //System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 1500)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
