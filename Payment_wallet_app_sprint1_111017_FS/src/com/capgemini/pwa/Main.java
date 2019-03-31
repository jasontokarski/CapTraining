package com.capgemini.pwa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;
import com.capgemini.pwa.doa.WalletDAOImpl;

public class Main {

	public static void main(String[] args) {
		boolean displayMainMenu = true, displaySubMenu = true;
		Scanner scan = new Scanner(System.in);
		WalletDAOImpl wdao = new WalletDAOImpl();
		
		while(displayMainMenu) {
			System.out.println("Payment Wallet Application");
			System.out.println("1) Register Account");
			System.out.println("2) Login");
			System.out.println("3) Exit");
			int selection = scan.nextInt();
			String emailChoice, usernameChoice;
			
			switch(selection) {
			case 1:
				Customer customer = new Customer();
				Wallet wallet = new Wallet();
				System.out.println("Enter username: ");
				usernameChoice = scan.next();
				while(wdao.usernameExists(usernameChoice)) {
					System.out.println("Username already exists!");
					System.out.println("Enter username: ");
					usernameChoice = scan.next();
				}
				customer.setUsername(usernameChoice);
				System.out.println("Enter password: ");
				customer.setPassword(scan.next());
				System.out.println("Enter first name: ");
				customer.setFirstName(scan.next());
				System.out.println("Enter last name: ");
				customer.setLastName(scan.next());
				System.out.println("Enter email: ");
				emailChoice = scan.next();
				while(wdao.emailExists(emailChoice)) {
					System.out.println("Email already exists!");
					System.out.println("Enter email: ");
					emailChoice = scan.next();
				}
				customer.setEmail(emailChoice);
				System.out.println("Enter mobile number: ");
				customer.setMobileNumber(scan.next());
				System.out.println("Enter date of birth: ");
				customer.setDateOfBirth(scan.next());
				customer.setWallet(wallet);
				
				wdao.database.put(customer.getUsername(), customer);
				System.out.println("Account created successfully.");
				/*
				if((wdao.validateAccount(customer)) == 1) {
					System.out.println("Username already exists.");
				} else if((wdao.validateAccount(customer) == 2)) {
					System.out.println("Email already exists.");
				} else {
					System.out.println("Account created successfully.");
					wdao.database.put(customer.getUsername(), customer);
				}*/
				break;
			case 2:
				System.out.println("Enter username: ");
				String userName = scan.next();
				System.out.println("Enter password: ");
				String password = scan.next();
				
				if(wdao.login(userName, password)) {
					System.out.println("Login successful");
					displaySubMenu = true;
				} else {
					System.out.println("Incorrect username or password.");
					break;
				}
				
				while(displaySubMenu) {
					System.out.println("1) Add funds");
					System.out.println("2) Show balance");
					System.out.println("3) Transfer funds");
					System.out.println("4) Withdraw funds");
					System.out.println("5) Logout");
					selection = scan.nextInt();
					
					switch(selection) {
					case 1:
						System.out.println("Enter the amount you wish to add (Example: 24.22)");
						double amountAdded = wdao.addAmount(userName, scan.nextDouble());
						if(amountAdded > 0) {
							System.out.println("Successfully added $" + String.format("%.2f", amountAdded) + " to your account (ID: " + wdao.getId(userName) + ")");
						} else {
							System.out.println("Could not add amount");
						}
						break;
					case 2:
						System.out.println("Your current balance is: $" + wdao.showBalance(userName));
						break;
					case 3:
						System.out.println("Enter the username you wish to transfer your balance too: ");
						String toUser = scan.next();
						if(!wdao.userExists(toUser)) {
							System.out.println("Username does not exist.");
							break;
						}
						System.out.println("Enter the amount you wish to transfer: ");
						Double transferAmount = scan.nextDouble();
						if(wdao.transferFunds(userName, toUser, transferAmount) > 0) {
							System.out.println("Successfully transfered $" + transferAmount + " from " + userName + " to " + toUser);
						} else {
							System.out.println("Error, insufficient funds.");
						}
						break;
					case 4:
						System.out.println("Enter the amount you wish to withdraw: ");
						Double withdrawAmount = scan.nextDouble();
						if(wdao.withdrawAmount(userName, withdrawAmount) > 0) {
							System.out.println("Successfully withdrew $" + withdrawAmount + " from " + userName + "'s account.");
						} else {
							System.out.println("Error, insufficient funds.");
						}
						break;
					case 5:
						displaySubMenu = false;
						break;
					default:
						System.out.println("Invalid selection.");
						break;
					}
				}
				break;
			case 3:
				System.out.println("Goodbye!");
				displayMainMenu = false;
				System.exit(0);
			default:
				System.out.println("Invalid selection.");
				break;
			}	
		}
		scan.close();
	}
}
