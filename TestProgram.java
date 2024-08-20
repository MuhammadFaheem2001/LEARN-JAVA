package Practice;

public class TestProgram {
    public static void main(String[] args) {
        // Create an Account object with ID 1122, balance $20,000, and annual interest rate 4.5%
        Account1 account = new Account1(1122, 20000);
        account.setAnnualInterestRate(4.5);

        // Use the withdraw method to withdraw $2,500
        account.withdraw(2500);

        // Use the deposit method to deposit $3,000
        account.deposit(3000);

        // Print the balance, the monthly interest, and the date when this account was created
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}