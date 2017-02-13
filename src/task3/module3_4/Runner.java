package task3.module3_4;

/**
 * Created by firsov on 13.02.2017.
 */
public class Runner {

    public static void main(String[] args) {
        User user = new User("Vova", 2000, 10, "Dell", 500, "dollar");
        user.withdraw(1100);
        System.out.println(user.getBalance());
        user.monthIncreaser(10);
        System.out.println(user.companyNameLenght());
    }
}
