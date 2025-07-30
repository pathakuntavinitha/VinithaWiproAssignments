package org.animals;

public class Tiger extends Animal {
    public Tiger(String color, int age, double weight) {
        super(color, age, weight);
    }

    public boolean isVegetarian() { return false; }
    public boolean canClimb() { return true; }
    public String sound() { return "Growl"; }
}

