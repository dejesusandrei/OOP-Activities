/**
 * @(#)testCalculator.java
 *
 *
 * @author 
 * @version 1.00 2026/3/14
 */


public class testCalculator {
	public static void main(String args[]) {
    	Multiply a = new Multiply();
    	
    	a.multiply(2, 5);
    	
    	a.multiply(50, 25.25);
    	
    	a.multiply(2, 5, 10);
    	
    	System.out.println ();
    	
    	Animal animal[] = {
    		new Dog(),
    		new Cat(),
    		new Cow()
    	};
    	
    	for(Animal an : animal){
    		an.sound();
    	}
    	
    	System.out.println ();
    	
    	Device dev;
    	
    	dev = new Laptop();
    	dev.turnOn();
    	dev = new Projector();
    	dev.turnOn();
	} 
}

class Multiply{
	void multiply(int n1, int n2){
		System.out.println (n1 + n2);
	}
	void multiply(double n1, double n2){
		System.out.println(n1 + n2);
	}
	void multiply(int n1, int n2, int n3){
		System.out.println (n1 + n2 + n3);
	}
}


interface Animal{
    void sound();
}
class Dog implements  Animal{
	public void sound(){ System.out.println ("Bark Bark"); }
}
class Cat implements Animal{
	public void sound(){ System.out.println ("Meow Meow"); }
}
class Cow implements Animal{
	public void sound(){ System.out.println ("Moww Moww"); }
}

interface Device{
    void turnOn();
}
class Laptop implements  Device{
	public void turnOn(){ System.out.println ("Laptop is on"); }
}
class Projector implements Device{
	public void turnOn(){ System.out.println ("Projector is on"); }
}