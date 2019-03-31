package com.capgemini.pwa.doa;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.pwa.beans.Customer;

public class WalletDAOImpl implements WalletDAO {
	
	public Map<String, Customer> database = new HashMap<>();
	public Customer currentCustomer;
	
	public boolean usernameExists(String username) {
		return database.containsKey(username);
	}
	
	public boolean emailExists(String email) {
		for(Customer c : database.values()) {
			if(c.getEmail() != null) {
				if(c.getEmail().equals(email)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean login(String userName, String password) {
		if(database.containsKey(userName)) {
			if(database.get(userName).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean userExists(String userName) {
		if(database.containsKey(userName)) {
			return true;
		}
		return false;
	}
	
	public double addAmount(String userName, double amount) {
		database.get(userName).getWallet().addAmount(amount);
		return amount;
	}
	
	public String showBalance(String userName) {
		return String.format("%.2f", database.get(userName).getWallet().getBalance());
	}
	
	public double transferFunds(String fromUser, String toUser, double amount) {
		if(database.get(fromUser).getWallet().getBalance() >= amount) {
			database.get(fromUser).getWallet().subtractAmount(amount);
			database.get(toUser).getWallet().addAmount(amount);
			return amount;
		}
		return -1.0;
	}
	
	public double withdrawAmount(String userName, double amount) {
		if(database.get(userName).getWallet().getBalance() >= amount) {
			database.get(userName).getWallet().subtractAmount(amount);
			return amount;
		}
		return -1.0;
	}
	
	public int getId(String userName) {
		return database.get(userName).getWallet().getAccountNumber();
	}
}
