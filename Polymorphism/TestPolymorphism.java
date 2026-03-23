/**
 * @(#)TestPolymorphism.java
 *
 *
 * @author 
 * @version 1.00 2026/3/14
 */


public class TestPolymorphism {
	public static void main(String args[]) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.sound();
    cat.sound();
	} 
}

abstract class Animal{
	abstract public void sound();
}
class Dog extends Animal{
	public void sound(){ System.out.println ("Bark Bark"); }
}
class Cat extends Animal{
	public void sound(){System.out.println ("Meow Meow"); }
}