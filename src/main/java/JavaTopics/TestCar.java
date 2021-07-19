package JavaTopics;

public class TestCar {
//when same method is present in parent class as well as in child class with the same name and same no of arguments is called method overriding
	public static void main(String[] args) {
		/*Compile time or static polymorphism
		 * at compile time Java will decide which method need to call
		 */
		System.out.println("========child calss refrernce variable can hold chlid class object=============");
		//overridden methods and child class methods will be called during static polymorphism
		BMW b= new BMW(); 
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine(); //Inheriting from grand parent
		System.out.println("========child calss refrernce variable can hold chlid class object=============");
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		System.out.println("========parent calss refrernce variable can hold chlid class object=============");
		
		// Top casting or Dynamic polymorphism
		//child class object can be refereed by parent class reference variable called dynamic or runtime polymorphism
		//you can refer my object but not properties,only overridden (common) methods and parent class methods will be called using dynamic polymorphism
		// this is also called top casting 
		Car CM= new BMW(); 
		CM.start();
		CM.refuel();
		CM.stop();
		CM.engine();
		//Down casting
		//Can we do down casting  : parent class object referred by child class reference variable : no
		//small thing can fit into big but big thing con't fit into small error saying cannot convert from car to BMW and add cast to
		//BMW b1=  new Car();
		System.out.println("========down Cating=============");
		BMW b1= (BMW) new Car(); //
		b1.engine();
		b1.start(); //getting error at runtime  java.lang.ClassCastException: JavaTopics.Car cannot be cast to JavaTopics.BMW
		b1.stop();
	}

}


