package assignment;
/*
 * 21.Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
 *  Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.
 */
abstract class Person
{
	public abstract void eat();
	public abstract void exercise();
}
class Athlete extends Person
{

	@Override
	public void eat() {
		System.out.println("Athlete eats a balanced diet with proteins,vitamins and carbs.");
	}

	@Override
	public void exercise() {
		System.out.println("Athlete exercises daily with running,weightlifting,jumping and yoga.");
	}
	
}
class Lazyperson extends Person
{

	@Override
	public void eat() {
		System.out.println("Lazy person eats junk food and snacks");
	}

	@Override
	public void exercise() {
		System.out.println("Lazy person rarely exercises and mostly prefers lying on the bed");
		
	}
	
}
public class PersonActions {

	public static void main(String[] args) {
		Person athelete=new Athlete();
		Person lazyperson=new Lazyperson();
		System.out.println("Athlete:");
		athelete.eat();
		athelete.exercise();
		System.out.println("Lazyperson:");
		lazyperson.eat();
		lazyperson.exercise();
		
		
	}

}
