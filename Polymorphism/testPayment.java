/**
 * @(#)testPayment.java
 *
 *
 * @author 
 * @version 1.00 2026/3/14
 */


public class testPayment {
	public static void main(String args[]) {
	    Payment pay[] = {
	   		new Gcash(),
	   		new CreditCardPayment(),
	   		new Gcash()	
	    };
	    for(Payment p : pay){ p.pay(); }
	    System.out.println ();
	    // To print only Gcash or Credit
	    for(int i = 0; i < pay.length; i++){
	    	if(pay[i] instanceof CreditCardPayment) pay[i].pay();
	    }
    }
}
interface Payment{
	void pay();
}
class Gcash implements Payment{
	public void pay(){ System.out.println ("Paid using Gcash"); }
}
class CreditCardPayment implements Payment{
	public void pay(){ System.out.println ("Paid using Credit Card"); }
}