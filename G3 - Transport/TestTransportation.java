/**
 * @(#)TestTransportation.java
 *
 *
 * @author 
 * @version 1.00 2026/3/7
 */
 import java.util.Scanner;
abstract class Transport{
	abstract void move();
	abstract void stop();
}

class Bus extends Transport{
	private String brand;
	private String loc;
	
	public  void setBrand(String brand){
		this.brand = brand;
	}
	
		public  void setDestination(String loc){
		this.loc = loc;
	}
	
	public void move(){
		System.out.println (brand + " is moving to " + loc);
	}
	
	public void stop(){
		System.out.println (brand + " is now stopping at " + loc);
	}
}

class Train extends Transport{
	
	private String brand;
	private String loc;
	
	public  void setBrand(String brand){
		this.brand = brand;
	}
	
	public  void setDestination(String loc){
		this.loc = loc;
	}
	
	public void move(){
		System.out.println (brand + " is moving to " + loc);
	}
	
	public void stop(){
		System.out.println (brand + " is now stoping at " + loc);
	}
}
public class TestTransportation {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println ("GROUP 3: ");
    	System.out.println ("Renz Villena");
    	System.out.println ("Kurt Tanlioco");
    	System.out.println ("Michelle Tamayo");
    	System.out.println ("Mary Cris Lokinario");
    	System.out.println ("Andrei De Jesus\n");
    	
        Bus b = new Bus();
        Train t = new Train();
        
        System.out.print("Input bus brand: ");
        String brand = scan.nextLine();
        b.setBrand(brand);
        
        System.out.print("Input bus destination: ");
        String desti = scan.nextLine();
        b.setDestination(desti);
        System.out.println();
        
        System.out.print("Input train brand: ");
        String brand1 = scan.nextLine();
        t.setBrand(brand1);
        
        System.out.print("Input train destination: ");
        String desti1 = scan.nextLine();
        t.setDestination(desti1);
        System.out.println();
        
        b.move();
        b.stop();
        System.out.println();
        t.move();
        t.stop();
    }
}

