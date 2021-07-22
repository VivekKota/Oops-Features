package BankApplication;

public abstract class Account {

	static String bankName = "HDFC";
	
	private String accountName;
    private int accountNumber;
    protected double balance; 
    public Account() {
    	
    }

    public Account(String accountName, int accountNumber) {
        this.accountName  = accountName;
    	this.accountNumber = accountNumber;
    	System.out.println("Account Name " + accountName + " created: account Number is " + accountNumber);
        balance = 0; 
    }


	public double getBalance() {
        //on validation
		return this.balance;
    }

	public String getAccountName() {
        //on validation
    	return this.accountName;
    }
	
    public int getAccountNumber() {
        //on validation
    	return this.accountNumber;
    }

    public abstract void deposit(double amount); 
    {
    	
    }
    public abstract void withdraw(double amount); 
    {
    	
    }
}