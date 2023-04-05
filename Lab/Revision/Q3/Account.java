package Lab.Revision.Q3;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() {};
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public int getId() { return id; }
    public double getBalance() { return balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }
    public Date getDate() { return dateCreated; }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
