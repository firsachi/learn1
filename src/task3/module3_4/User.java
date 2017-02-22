package task3.module3_4;

/**
 * Created by firsov on 13.02.2017.
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

     public void paySalary(){
        balance = balance + salary;
     }

     public void withdraw(int summ){
         chekSumm(summ);
         int chekSumm = 1000;
         int commission = 5;
         if (summ > chekSumm){
             commission = 10;
         }
         int coef = 100;
         commission = summ * commission / coef;
         summ = summ + commission;
         chekSumm(summ);
         balance = balance - summ;
    }

    private void chekSumm(int summ){
         boolean result = false;
         if ( balance < summ) try {
             throw  new IllegalArgumentException(Messages.BALNSE_MIN);
         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    public int companyNameLenght(){
        return companyName.length();
    }

    public void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }
}
