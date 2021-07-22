package BankApplication;

public class SavingsAccount extends Account {

	public static double interestRate  =0.04 ;
	private int noOfDays;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountName, int accountNumber) {
		super(accountName, accountNumber);
	}

	public double calcInterest() {
		return balance * interestRate* noOfDays/365;
	}

	public void applyInterest(int noOfDays) {
		
		this.noOfDays = noOfDays ;
		double interest = calcInterest();
		System.out.printf("Interest amount %.2f added to balance%n", interest);
		deposit(interest);
	}

	public void deposit(double amount) {

			balance += amount;
			System.out.printf("Amount %.2f deposited%n", amount);
			System.out.printf("Current Balance is: %.2f%n", balance);
	}

	public void withdraw(double amount) {

		// Check sufficient balance
		if ((amount) <= balance) {
			System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
			balance -= amount;
			System.out.printf("Current Balance is: %.2f%n", balance);
		}

		else {
			System.out.println("Amount to withdraw should be less than balance");
			System.out.printf("balance: %.2f present", balance);
		}
	}
}
