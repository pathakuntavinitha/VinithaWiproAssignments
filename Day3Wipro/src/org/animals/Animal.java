package org.animals;
public class Animal
{
    protected String color;
    protected int age;
    protected double weight;

    public Animal(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Some generic sound";
    }

    public void displayInfo(String name) {
        System.out.println("Animal: "+name);
        System.out.println("Color: " +color);
        System.out.println("Age: " +age+" years");
        System.out.println("Weight: "+weight +" kg");
        System.out.println("Vegetarian: " +isVegetarian());
        System.out.println("Can Climb: " +canClimb());
        System.out.println("Sound: " +sound());
    }

}
