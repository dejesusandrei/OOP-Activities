class BankMain{
	public static void main(String andrei[]){
		BankAccount acc = new BankAccount("Maria Santos", "2026-001", 1000.00);
		acc.printBankInfo();
		
		acc.deposit(500.00);
		acc.withdraw(2000.00);
		acc.withdraw(300.00);

	}
}