package com.capgemini.pwa.doa;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.pwa.beans.Customer;

public interface WalletDAO {
	public boolean login(String userName, String password);
	public double addAmount(String userName, double amount);
	public String showBalance(String userName);
	public double transferFunds(String fromUser, String toUser, double amount);
	public double withdrawAmount(String userName, double amount);
}
