package task4.module4_1.bank_system;

import task4.module4_1.users.User;

/**
 * Created by firsov on 20.02.2017.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
