package model.entities;

import model.exceptions.WithdrawException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(int number, String holder, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
		balance = 0.0;
	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double balance() {
		return balance;
	}

	public Double getWihdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) throws WithdrawException {
		if (balance < amount) {
			throw new WithdrawException("Not enough balance");
		}

		if (amount > withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit");
		}

		balance -= amount;
	}

}
