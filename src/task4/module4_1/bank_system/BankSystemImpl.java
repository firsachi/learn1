package task4.module4_1.bank_system;

import sun.plugin2.message.Message;
import task4.module4_1.users.User;

/**
 * Created by firsov on 20.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        comparedBalance(user, amount);
        if (user.getBank().getLimitOfWithdrawal() < amount) {
            System.out.println("Limit is exceeded!!!");
            return;
        }
        amount = amount + (amount / 100)* user.getBank().getCommission(amount);
        comparedBalance(user, amount);
        user.setBalance(user.getBalance() - amount);
    }

    private void comparedBalance(User user, int amount){
        if(user.getBalance() < amount) {
            System.out.println("Not only money in the account!!!");
            return;
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        amount = amount - (amount / 100)* user.getBank().getCommission(amount);
        if ( 0 != user.getBank().getLimitOfFunding() && user.getBank().getLimitOfFunding() < amount) {
            System.out.println("Limit is exceeded!!!");
            return;
        }
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(toUser.getBank().getLimitOfFunding() < amount){
            System.out.println("Recipient limit is exceeded!!!");
        }
        withdrawOfUser(fromUser , amount);
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }



}
