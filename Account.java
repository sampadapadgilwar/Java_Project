package BankBusinessLogic;

public class Account extends User {
	String accNumber;
	double balance;

	Account(String userName, String phoneNo, String pwd) {
		super(userName, phoneNo, pwd);
	}

	Account(String userName, String phoneNo, String pwd, String accNumber, double balance) {
		this(userName, phoneNo, pwd);
		this.accNumber = accNumber;
		this.balance = balance;
	}

}
