package assignment;

import java.util.Scanner;

abstract class Bank {
    protected String accNo;
    protected String custName;
    protected int custGender; 
    protected String custJob;
    protected double curBal;

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public abstract double calcBalance();

    public String toString() {
        String gender = (custGender == 1) ? "Male" : "Female";
        return "Account No: " + accNo + "\nName: " + custName +
                "\nGender: " + gender +
                "\nJob: " + custJob +
                "\nCurrent Balance: RM" + curBal +
                "\nFinal Balance: RM" + calcBalance();
    }
    
    public String getAccNo() {
        return accNo;
    }
}
class Saving extends Bank {
    private double savRate;

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}
 class Current extends Bank {
    private boolean fixedDep;
    private double curRate;

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150;
        }
        return balance;
    }
}
public class BankApp {
	 public static void main(String[] args) {
	        Bank[] customers = new Bank[5];
	        customers[0] = new Saving("S101", "Alice", 2, "Teacher", 5000, 0.05);
	        customers[1] = new Current("C202", "Bob", 1, "Engineer", 8000, true, 0.03);
	        customers[2] = new Current("C303", "Charlie", 1, "Manager", 12000, false, 0.04);
	        customers[3] = new Saving("S404", "Diana", 2, "Doctor", 15000, 0.06);
	        customers[4] = new Current("C505", "Ethan", 1, "Lawyer", 10000, true, 0.02);

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Number to search: ");
	        String accSearch = sc.nextLine();
	        boolean found = false;

	        for (Bank b : customers) {
	            if (b.getAccNo().equalsIgnoreCase(accSearch)) {
	                System.out.println("\nCustomer Found:\n" + b);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Account Number not found.");
	        }
	        int count = 0;
	        double totalCurrentBal = 0;

	        for (Bank b : customers) {
	            if (b instanceof Current) {
	                count++;
	                totalCurrentBal += b.calcBalance();
	            }
	        }

	        System.out.println("\nNumber of Current Account Holders: " + count);
	        System.out.println("Total Balance in Current Accounts: RM" + totalCurrentBal);
	 }
}
