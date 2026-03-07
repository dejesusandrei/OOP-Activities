import java.util.*;
class BankAccountMain{
	public  static void main(String andrei[]){

		Scanner scan = new Scanner(System.in);
		BankAccountEncap b1 = new BankAccountEncap();

		System.out.print("Enter a balance: ");
		double balance = scan.nextDouble();
		b1.setBalance(balance);

		System.out.printf("Remaining balance: %.2f", b1.getBalance());
	}
}