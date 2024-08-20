package Practice;

import java.util.Date;

public class Account1 {
   
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

   
    public Account1() {
        this.dateCreated = new Date();
    }

    
    public Account1(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

   
    public Date getDateCreated() {
        return dateCreated;
    }

   
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

  
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public void deposit(double amount) {
        balance += amount;
    }
}
