package Practice;

public class AccTest {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		System.out.println("----------------STATE BANK OF PAKISTAN--------------------\n");
		
		
		acc.CreateAccount();
		acc.getMonthlyInterest();
		acc.getMonthlyInterestRate();
		

		System.out.println("\nMontly Interest Rate is: " + acc.monthlyInterestRate);
		System.out.println("Monthly Interest is: " + acc.getMonthlyInterest());
		
		acc.withdraws();
		acc.deposit();
		
	}

}
