package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000;
		this(1000);
	}
	public Deposit(int princiapl) {
		//this.balance = princiapl;
		this(princiapl, 0);
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}
	public int getBalance() {
		return balance;
	}
}
