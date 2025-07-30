package assignment;
/*
 * 17.Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods 
in the base class and specific methods in the corresponding class. Create a class called Road 
and create objects for the Truck, Car, Bus etc and display the appropriate message. 

In the Vehicle class constructor initialize few variables like color, no of 
wheels, model etc. Give appropriate values for these variables from the invoking subclass.  


 */
class Vehicle
{
	String color;
	int wheels;
	String model;
	
	public Vehicle(String color, int wheels, String model) {
		super();
		this.color = color;
		this.wheels = wheels;
		this.model = model;
	}
	public void display()
	{
		System.out.println("Model : "+model+","+"Color : "+color+","+"Number of Wheels: "+wheels);
	}
	
}
class Truck extends Vehicle
{

	public Truck(String color, int wheels, String model) {
		super(color, wheels, model);
		
	}
	public void goods() {
		System.out.println("Truck is loading goods");
	}
	
}
class Bus extends Vehicle
{

	public Bus(String color, int wheels, String model) {
		super(color, wheels, model);
		
	}
	public void passengers()
	{
		System.out.println("Bus is carrying passengers");
	}
	
}
class Car extends Vehicle
{

	public Car(String color, int wheels, String model) {
		super(color, wheels, model);
	
	}
	public void Music() 
	{
	   System.out.println("Car is playing music");
	}
	public void turnOnAC() 
	{
	   System.out.println("Car air conditioner is now ON");
	}
	
	
}

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Truck:");
		Truck truck=new Truck("Red",10,"Force Urbania");
		truck.display();
		truck.goods();
		System.out.println("Bus:");
		Bus bus=new Bus("White",4,"Volvo B9R");
		bus.display();
		bus.passengers();
		System.out.println("Car:");
		Car car = new Car("Black",4,"Maruti Swift");
		car.display();
		car.Music();
		car.turnOnAC();
		

	}

}
