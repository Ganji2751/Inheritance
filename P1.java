import java.lang.*;
import java.util.*;

class Animal
{
	public static void eat()
	{
		System.out.println("I'am in Animal's eat method ");
	}
	public static void sleep()
	{
		System.out.println("I'am in Animal's sleep method ");

	}
}
class Bird extends Animal
{
	public static void eat()
	{
		System.out.println("I'am in Bird's eat method ");	
	}
	public static void sleep()
	{
		System.out.println("I'am in Bird's sleep method ");
	}
	public static void fly()
	{
		System.out.println("I'am in Bird's fly method ");
	}
}
class P1
{
	public static void main(String args[])
	{
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}	
