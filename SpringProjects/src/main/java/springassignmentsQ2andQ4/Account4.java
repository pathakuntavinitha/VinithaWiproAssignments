package springassignmentsQ2andQ4;

public class Account4 {
	int accountNumber;
	String accountHolderName;
	double balance;
	String type;
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void Print() {
		System.out.println(" Account Details ");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
        System.out.println("Account Type        : " + type);
       
	}
	
	

}
