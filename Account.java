package Practice;

import java.util.Scanner;

public class Account {

	 int id = 1122;
	 double balance = 20000.0;
	 double annualInterestRate = 4.5;
	 String dateCreated = "17-05-2024";
	 double monthlyInterestRate = 2.5;
	
	
	
	public void CreateAccount(){
		System.out.println("\nThis Account ID is: " + id);
		System.out.println("At the Time of Account Opening Balance is: " + this.balance + "\nAnd Date of Creation of Account is:" +  this.dateCreated);
		
	}
	
	public double getMonthlyInterestRate() {
		
		return annualInterestRate / 100;
		
	}
	
	public double getMonthlyInterest() {
		
		return balance * monthlyInterestRate;
		
	}
	
	public void withdraws () {
		double wid;
		Scanner ask1 = new Scanner(System.in);
		
		
		System.out.println("\nHow Much Would You Like To Widraw: ");
		wid = ask1.nextDouble();
		
		System.out.println("The Total Balance After Widraw Money From Account is: " + (balance - wid));
		
	}
	
	public void deposit() {
		
		Scanner ask = new Scanner(System.in);
		
		double dep;
		
		System.out.println("\nHow Much Would You Like To Deposit: ");
		dep = ask.nextDouble();
		
		System.out.println("The Total Balance is After Deposit Money : " + (balance + dep));
		
		
		
		
	}
	
	
	
}
