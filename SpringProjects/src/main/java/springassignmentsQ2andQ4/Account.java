package springassignmentsQ2andQ4;

public class Account {
	
	int accountNumber;
	String accountHolderName;
	double balance;
	Bank bank;
	public Account(int accountNumber, String accountHolderName, double balance, Bank bank) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.bank = bank;
	}

	public void Printdetails() {
		// TODO Auto-generated method stub
		System.out.println("  Account Details ");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
        System.out.println("Bank ID             : " + bank.getBankId());
        System.out.println("Bank Name           : " + bank.getBankName());
	}
	
	
	
	
	

}
