package task4.module4_1.banks;

import task4.module4_1.Currency;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by firsov on 20.02.2017.
 */
public class USBank extends Bank {

    private Map<Currency, Integer> limitOfWithdrawal = new HashMap<>();
    {
        limitOfWithdrawal.put(Currency.EUR, 1200);
        limitOfWithdrawal.put(Currency.USD, 1000);
    }
    private Map<Currency, Integer> limitOfFunding = new HashMap<>();
    {
        limitOfFunding.put(Currency.USD, 0);
        limitOfFunding.put(Currency.EUR, 10000);
    }

    private Map<Currency, Integer> monthlyRate = new HashMap<>();
    {
        monthlyRate.put(Currency.EUR, 2);
        monthlyRate.put(Currency.USD, 1);
    }


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return limitOfWithdrawal.get(getCurrency());
    }

    @Override
    public int getLimitOfFunding() {
        return limitOfFunding.get(getCurrency());
    }

    @Override
    public int getMonthlyRate() {
        return monthlyRate.get(getCurrency());
    }

    @Override
    public int getCommission(int summ) {
        int commission = 0;
        int upperLimit = 1000;
        if (Currency.USD == getCurrency()){
            if (summ < upperLimit){
                commission = 5;
            }else {
                commission = 7;
            }
            return commission;
        }else {
            if (summ < upperLimit){
                commission = 6;
            }else {
                commission =8;
            }
            return commission;
        }
    }

    @Override
     public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
