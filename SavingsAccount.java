package Inheritance;

public class SavingsAccount extends Account {
   
    private static final double MIN_BALANCE = 10;
    private static final double WITHDRAWAL_FEE = 2;

    
    public SavingsAccount(String id, double initialDeposit) {
        super(id, initialDeposit);
        if (initialDeposit < MIN_BALANCE) {
            throw new IllegalArgumentException("Initial deposit must be at least $" + MIN_BALANCE);
        }
    }

 
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

   
    @Override
    public boolean withdraw(double amount) {
        if (amount + WITHDRAWAL_FEE <= balance - MIN_BALANCE) {
            balance -= (amount + WITHDRAWAL_FEE);
            return true;
        }
        return false;
    }

   
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("12345", 50);
        
        System.out.println("Account ID: " + account.getID());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        account.deposit(20);
        System.out.println("Balance after deposit of $20: $" + account.getBalance());
        
        boolean withdrawResult = account.withdraw(30);
        System.out.println("Withdrawal of $30 successful: " + withdrawResult);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        
        withdrawResult = account.withdraw(50);
        System.out.println("Withdrawal of $50 successful: " + withdrawResult);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}