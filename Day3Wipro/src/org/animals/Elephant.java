package org.animals;

public class Elephant extends Animal {
    public Elephant(String color, int age, double weight) {
        super(color, age, weight);
    }

    public boolean isVegetarian() { return true; }
    public boolean canClimb() { return false; }
    public String sound() { return "Trumpet"; }
}