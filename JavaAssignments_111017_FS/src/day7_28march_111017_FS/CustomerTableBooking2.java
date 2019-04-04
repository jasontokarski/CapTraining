package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerTableBooking2 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		//List is an interface it cannot be instantiated, instantiate an ArrayList
		List<Customer> customerList = new ArrayList<Customer>();
		List<Customer> searchResults = new ArrayList<Customer>();
		Customer c = new Customer();
		String input;
		System.out.println("Enter the number of customers:");
		int numCustomers = scan.nextInt();
		for(int i = 0; i < numCustomers; i++) {
			System.out.println("Enter information for customer " + (i+1) + ": ");
			input = scan.next();
			c = theContactBO.createCustomer(input);
			customerList.add(c);
		}
		System.out.println("Enter the search type");
		System.out.println("1. By name");
		System.out.println("2. By birth date");
		System.out.println("3. By rating");
		
		switch(scan.nextInt()) {
		case 1:
			System.out.println("Enter the name of the customer to be searched:");
			searchResults = theContactBO.findCustomer(customerList, scan.next());
			if(searchResults.isEmpty()) {
				System.out.println("Customer not found.");
			} else {
				System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
				for(int i = 0; i < searchResults.size(); i++) {
					System.out.print(searchResults.get(i).toString2());
				}
			}
			break;
		case 2:
			System.out.println("Enter the birthdate of the customer to be searched:");
			String birthDate = scan.next();
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(birthDate);
			searchResults = theContactBO.findCustomer(customerList, date);
			if(searchResults.isEmpty()) {
				System.out.println("Customer not found.");
			} else {
				System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
				for(int i = 0; i < searchResults.size(); i++) {
					System.out.print(searchResults.get(i).toString2());
				}
			}
			break;
		case 3:
			System.out.println("Enter the rating of the customer to be searched:");
			searchResults = theContactBO.findCustomer(customerList, scan.nextDouble());
			if(searchResults.isEmpty()) {
				System.out.println("Customer not found.");
			} else {
				System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
				for(int i = 0; i < searchResults.size(); i++) {
					System.out.print(searchResults.get(i).toString2());
				}
			}
			break;
		default:
			System.out.println("Invalid selection.");
		}
		scan.close();
	}

}
