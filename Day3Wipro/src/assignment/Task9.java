/*
 *9.A shopkeeper sells three products whose retail prices are as follows: 
Product 1 - 22.50
              Product 2 - 44.50 
              Product 3 - 9.98
Write an application that reads a series of pairs of numbers as follows:
 a) Product number 
 b) Quantity sold

                The application should use a switch statement to determine the retail price for each product. It 
should calculate and display the total retail value of all products sold.
 */
package assignment;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    double total =0.0;
	    char choice;
	    do {
            System.out.println("Enter product number 1 or 2 or 3: ");
            int productnumber=sc.nextInt();
            System.out.println("Enter quantity sold: ");
            int quantity=sc.nextInt();
            double price;
            switch(productnumber){
                case 1:
                    price=22.50;
                    break;
                case 2:
                    price=44.50;
                    break;
                case 3:
                    price=9.98;
                    break;
                default:
                    System.out.println("Invalid product number!");
                    price=0.0;
                    
            }
            double value=price*quantity;
            total+=value;
            System.out.print("Do you want to enter another product? (y/n): ");
            choice=sc.next().charAt(0);
        } while(choice=='y'||choice=='Y');
        System.out.printf("Total retail value of all products sold: %.2f \n",total);
        sc.close();
	}

}
