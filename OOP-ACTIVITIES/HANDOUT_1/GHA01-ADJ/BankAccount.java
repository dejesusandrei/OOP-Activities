class BankAccount{
	// PRIVATE ATTRIBUTES
	private String accountName;
	private String accountNumber;
	private double balance;
	
	// DEFAULT CONSTRUCTOR
	public BankAccount(){
		this.accountName = "No Name";
		this.accountNumber = "0000";
		this.balance = 0.0;
	}

	// PARAMETARIZED 
	public BankAccount(String accountName, String accountNumber, double balance){
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// SETTERS
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	public void setAccountNum(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	// GETTERS
	public String getAccountName(){
		return accountName;
	}

	public String getAccountNum(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	// METHODS
	public void deposit(double amount) {
    		if (amount > 0) {
        		balance += amount;
        		System.out.printf("Deposit: %.2f", amount);
			System.out.printf(" successful.\n" + "Balance: %.2f\n", balance);

    		}
	}

	public void withdraw(double amount) {
    		if (amount > 0 && amount <= balance) {
        		balance -= amount;
        		System.out.printf("Withdraw: %.2f", amount);
			System.out.printf(" successful.\n" + "Balance: %.2f\n", balance);

    		} else {
        		System.out.printf("Withdraw: %.2f", amount);
			System.out.printf(" failed. Insufficient balance.\n" + "Balance: %.2f\n", balance);
			
    		}
	}

	public void printBankInfo(){
		System.out.printf("Account: " + accountName + " | No: " + accountNumber + " | Balance: %.2f\n" , balance);
	}

	

	
}