package entities;

public class Account {
	private int accountNumber;
	private String name;
	private double accountValue;
	
	public Account(int accountNumber, String name, double value) {
		this.accountNumber = accountNumber;
		this.name = name;
		accountValue = value;
	}
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getAccountValue() {
		return accountValue;
	}
	
	public void deposit(double value) {
		accountValue += value;
	}
	
	public void withdraw(double value) {
		accountValue -= (value + 5);
	}
	
}
