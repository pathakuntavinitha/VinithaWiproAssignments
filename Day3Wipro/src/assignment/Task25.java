package assignment;

import java.util.Scanner;

public class Task25 {

    public static double area(double a, double b, double c) {
        double s = perimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side a (-1 to exit):");
            double a = sc.nextDouble();
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }
            System.out.print("Enter side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            if (isValid(a, b, c)) {
                double area = area(a, b, c);
                double perimeter = perimeter(a, b, c);
                System.out.println("Valid triangle.");
                System.out.printf("Perimeter: %.2f\n", perimeter);
                System.out.printf("Area: %.2f\n", area);
            } else {
                System.out.println("The input is invalid.");
            }
        }
    }
}

