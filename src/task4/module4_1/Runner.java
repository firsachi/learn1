package task4.module4_1;

import task4.module4_1.bank_system.BankSystem;
import task4.module4_1.bank_system.BankSystemImpl;
import task4.module4_1.banks.Bank;
import task4.module4_1.banks.ChinaBank;
import task4.module4_1.banks.EUBank;
import task4.module4_1.banks.USBank;
import task4.module4_1.users.User;

/**
 * Created by firsov on 20.02.2017.
 */
public class Runner {

    public static void main(String[] args) {

        Bank bank1 = new USBank(1,"USA", Currency.USD, 10,1000, 2, 100000);
        Bank bank2 = new USBank(1,"Germany", Currency.EUR, 10,1000, 2, 100000);
        Bank bank3 = new EUBank(1,"Ukraine", Currency.EUR, 10,1000, 2, 100000);
        Bank bank4 = new EUBank(1,"Italia", Currency.USD, 10,1000, 2, 100000);
        Bank bank5 = new ChinaBank(1,"China", Currency.USD, 10,1000, 2, 100000);
        Bank bank6 = new ChinaBank(1, "Rossiya", Currency.EUR, 10,1000, 2, 100000);

        BankSystem bankSystem = new BankSystemImpl();

        User user1 = new User();
        user1.setId(1);
        user1.setName("User1");
        user1.setBalance(10000);
        user1.setMonthsOfEmployment(3);
        user1.setCompanyName("Company1");
        user1.setSalary(10000);
        user1.setBank(bank1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("User2");
        user2.setBalance(1000);
        user2.setMonthsOfEmployment(3);
        user2.setCompanyName("Company1");
        user2.setSalary(1000);
        user2.setBank(bank2);

        User user3 = new User();
        user3.setId(3);
        user3.setName("User3");
        user3.setBalance(1000);
        user3.setMonthsOfEmployment(3);
        user3.setCompanyName("Company1");
        user3.setSalary(1000);
        user3.setBank(bank3);

        User user4 = new User();
        user4.setId(4);
        user4.setName("User4");
        user4.setBalance(1000);
        user4.setMonthsOfEmployment(3);
        user4.setCompanyName("Company1");
        user4.setSalary(1000);
        user4.setBank(bank4);

        User user5 = new User();
        user5.setId(5);
        user5.setName("User5");
        user5.setBalance(1000);
        user5.setMonthsOfEmployment(3);
        user5.setCompanyName("Company1");
        user5.setSalary(1000);
        user5.setBank(bank5);

        User user6 = new User();
        user6.setId(6);
        user6.setName("User6");
        user6.setBalance(1000);
        user6.setMonthsOfEmployment(3);
        user6.setCompanyName("Company1");
        user6.setSalary(100);
        user6.setBank(bank6);

        System.out.println(user1.toString());
        bankSystem.withdrawOfUser(user1, 2000);
        System.out.println(user1.toString());
        bankSystem.fundUser(user1, 100);
        System.out.println(user1.toString());
        bankSystem.paySalary(user1);
        System.out.println(user1.toString());
        bankSystem.transferMoney(user1, user2, 100);
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println(user2.toString());
        bankSystem.withdrawOfUser(user2, 20);
        System.out.println(user2.toString());
        bankSystem.fundUser(user2, 10);
        System.out.println(user2.toString());
        bankSystem.paySalary(user2);
        System.out.println(user2.toString());
        bankSystem.transferMoney(user2, user3, 11);
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        System.out.println(user3.toString());
        bankSystem.withdrawOfUser(user3, 2);
        System.out.println(user3.toString());
        bankSystem.fundUser(user3, 13);
        System.out.println(user3.toString());
        bankSystem.paySalary(user3);
        System.out.println(user3.toString());
        bankSystem.transferMoney(user3, user4, 5);
        System.out.println(user3.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());

        bankSystem.withdrawOfUser(user4, 22);
        System.out.println(user4.toString());
        bankSystem.fundUser(user4, 10);
        System.out.println(user4.toString());
        bankSystem.paySalary(user4);
        System.out.println(user4.toString());
        bankSystem.transferMoney(user4, user5, 11);
        System.out.println(user4.toString());
        System.out.println(user5.toString());

        System.out.println(user5.toString());
        bankSystem.withdrawOfUser(user5, 17);
        System.out.println(user5.toString());
        bankSystem.fundUser(user5, 21);
        System.out.println(user5.toString());
        bankSystem.paySalary(user5);
        System.out.println(user5.toString());
        bankSystem.transferMoney(user5, user6, 10);
        System.out.println(user5.toString());
        System.out.println(user6.toString());

        System.out.println(user6.toString());
        bankSystem.withdrawOfUser(user6, 10);
        System.out.println(user6.toString());
        bankSystem.fundUser(user6, 20);
        System.out.println(user6.toString());
        bankSystem.paySalary(user6);
        System.out.println(user6.toString());
        bankSystem.transferMoney(user6, user1, 11);
        System.out.println(user6.toString());
        System.out.println(user1.toString());
    }

}
