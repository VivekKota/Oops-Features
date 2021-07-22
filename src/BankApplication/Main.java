package BankApplication;

public class Main {

	public static void main(String[] args) {
		
		Account currentAccount = new CurrentAccount("Vivek" , 500100);
		currentAccount.deposit(10000);
		currentAccount.withdraw(5000);
		
		SavingsAccount savingsAccount =  new SavingsAccount("Raj", 500200);
		savingsAccount.deposit(100000);
		savingsAccount.applyInterest(365);
		
		
	}

}
