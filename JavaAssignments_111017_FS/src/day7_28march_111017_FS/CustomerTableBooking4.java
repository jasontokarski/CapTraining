package day7_28march_111017_FS;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerTableBooking4 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		//List is an interface it cannot be instantiated, instantiate an ArrayList
		List<Customer> customerList = new ArrayList<Customer>();
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
		System.out.println("Enter a type to sort");
		System.out.println("1. Name");
		System.out.println("2. Amount Spent");
		System.out.println("3. Rating");
		
		switch(scan.nextInt()) {
		case 1:
			System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
			Collections.sort(customerList);
			for(Customer customer : customerList) {
				System.out.print(customer.toString2());
			}
			break;
		case 2:
			Collections.sort(customerList, new namedAmountComparator());
			System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
			for(Customer customer : customerList) {
				System.out.print(customer.toString2());
			}
			break;
		case 3:
			Collections.sort(customerList, new namedRatingComparator());
			System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
			for(Customer customer : customerList) {
				System.out.print(customer.toString2());
			}
			break;
		default:
			System.out.println("Invalid Selection.");
			break;
		}
		scan.close();
	}
}

class namedAmountComparator implements Comparator<Customer> {
	public int compare(Customer c1, Customer c2) {
		if(c1.getAverageSpendAmount() > c2.getAverageSpendAmount())
			return 1;
		else if(c1.getAverageSpendAmount() < c2.getAverageSpendAmount())
			return -1;
		else
			return 0;
	}
}

class namedRatingComparator implements Comparator<Customer> {
	public int compare(Customer c1, Customer c2) {
		if(c1.getRating() > c2.getRating())
			return 1;
		else if(c1.getRating() < c2.getRating())
			return -1;
		else
			return 0;
	}
}