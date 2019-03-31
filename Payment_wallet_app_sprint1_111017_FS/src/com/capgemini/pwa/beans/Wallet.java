package com.capgemini.pwa.beans;

public class Wallet {
	private int accountNumber;
	private double balance;
	
	public Wallet() {
		super();
		accountNumber++;
		balance = 0;
	}

	public Wallet(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addAmount(double amount) {
		this.balance += amount;
	}
	
	public void subtractAmount(double amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Wallet [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
