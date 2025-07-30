package assignment1;
/*
 * 20.Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
 */
abstract class Vehicle
{
	public abstract void startEngine();
	public abstract void stopEngine();	
}
class Car extends Vehicle
{

	@Override
	public void startEngine() {
		System.out.println("Car engine starts with Key");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped");
		
	}
	
}
class Motorcycle extends Vehicle
{

	@Override
	public void startEngine() {
		System.out.println("Motorcycle starts with self start");
	}

	@Override
	public void stopEngine() {
		System.out.println("Motorcycle engine stopped");
		
	}
	
}

public class VehicleActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car=new Car();
		Vehicle motorcycle=new Motorcycle();
		System.out.println("Car:");
		car.startEngine();
		car.stopEngine();
		System.out.println("Motorcycle:");
		motorcycle.startEngine();
		motorcycle.stopEngine();

	}

}
