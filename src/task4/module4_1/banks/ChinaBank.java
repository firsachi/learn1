package task4.module4_1.banks;

import task4.module4_1.Currency;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by firsov on 20.02.2017.
 */
public class ChinaBank extends Bank {

    private Map<Currency, Integer> limitOfWithdrawal = new HashMap<>();
    {
        limitOfWithdrawal.put(Currency.EUR, 150);
        limitOfWithdrawal.put(Currency.USD, 100);
    }
    private Map<Currency, Integer> limitOfFunding = new HashMap<>();
    {
        limitOfFunding.put(Currency.USD, 10000);
        limitOfFunding.put(Currency.EUR, 5000);
    }

    private Map<Currency, Integer> monthlyRate = new HashMap<>();
    {
        monthlyRate.put(Currency.EUR, 0);
        monthlyRate.put(Currency.USD, 1);
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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
                commission = 3;
            }else {
                commission = 5;
            }
            return commission;
        }else {
            if (summ < upperLimit){
                commission = 10;
            }else {
                commission =11;
            }
            return commission;
        }
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
