package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomerTableBooking {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		String customerDetails;
		String[] details;
		CustomerBO cbo = new CustomerBO();
		Customer customer1;
		Customer customer2;
		Date birthdate;
		Date enrollDate;
		
		System.out.println("Enter the details of Customer 1: ");
		customerDetails = scan.next();
		details = customerDetails.split(",");
		details = cbo.clearSpaces(details);
		birthdate = new SimpleDateFormat("dd-MM-yyyy").parse(details[3]);
		enrollDate = new SimpleDateFormat("dd-MM-yyyy").parse(details[6]);
		customer1 = new Customer(Long.parseLong(details[0]),details[1],details[2],birthdate,Double.parseDouble(details[4]),Double.parseDouble(details[5]),enrollDate,Double.parseDouble(details[7]));
		
		System.out.println("Enter the details of Customer 2: ");
		customerDetails = scan.next();
		details = customerDetails.split(",");
		details = cbo.clearSpaces(details);
		birthdate = new SimpleDateFormat("dd-MM-yyyy").parse(details[3]);
		enrollDate = new SimpleDateFormat("dd-MM-yyyy").parse(details[6]);
		customer2 = new Customer(Long.parseLong(details[0]),details[1],details[2],birthdate,Double.parseDouble(details[4]),Double.parseDouble(details[5]),enrollDate,Double.parseDouble(details[7]));
		
		System.out.println("Details of Customer 1: ");
		System.out.println(customer1);
		System.out.println("Details of Customer 2: ");
		System.out.println(customer2);
		if(customer1.equals(customer2)) {
			System.out.println("Customer 1 is same as Customer 2");
		} else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
		scan.close();
	}

}
