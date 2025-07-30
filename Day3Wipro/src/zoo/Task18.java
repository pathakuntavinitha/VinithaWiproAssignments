package zoo;

import org.animals.*;

public class Task18 {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 5, 190);
        Tiger tiger = new Tiger("Orange with black stripes", 4, 210);
        Deer deer = new Deer("Brown", 3, 80);
        Monkey monkey = new Monkey("Gray", 2, 25);
        Elephant elephant = new Elephant("Grey", 10, 5000);
        Girafee giraffe = new Girafee("Yellow with brown patches", 6, 900);

        lion.displayInfo("Lion");
        tiger.displayInfo("Tiger");
        deer.displayInfo("Deer");
        monkey.displayInfo("Monkey");
        elephant.displayInfo("Elephant");
        giraffe.displayInfo("Giraffe");
    }
}
