package BankApplication;

public class CurrentAccount extends Account {

    static double FEE = 2.5 ;

    public CurrentAccount() {
        super();
    }
    
    public CurrentAccount(String accountName, int accountNumber) {
        super(accountName,accountNumber);
    }

 
    public void deposit(double amount) {

            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);

            // Apply Transaction Fee
            balance -= FEE;
            System.out.printf("Fee %.2f Applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);
    }

 
    public void withdraw(double amount) {
            
        	// Check sufficient balance
            if((amount+FEE) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
            
            else {
            System.out.println("Amount to withdraw should be less than balance");
            System.out.printf("balance: %.2f present",balance);
            
        }
    }
}