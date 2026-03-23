/**
 * @(#)testDynamicDispatch.java
 *
 *
 * @author 
 * @version 1.00 2026/3/14
 */


public class testDynamicDispatch {
	public static void main(String args[]) {    
		Animal a;
		
		a = new Cat();
		a.sound();
		
		a = new Dog();
		a.sound();
		
		a = new Tismo();
		a.sound();
	}
}

abstract class Animal{
	abstract public void sound();
}
class Dog extends Animal{
	public void sound(){ System.out.println ("Bark Bark"); }
}
class Cat extends Animal{
	public void sound(){ System.out.println ("Meow Meow"); }
}
class Tismo extends Animal{
	public void sound(){ System.out.println ("Open Open"); }
}
