package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomerTableBooking3 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. Validate Age\n2. Validate Name\n3. Lucky Customer\n");
		System.out.println("Enter your choice");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("Enter birthdate:");
			Date age = new SimpleDateFormat("dd-MM-yyyy").parse(scan.next());
			if(Main.validateAge(age))
				System.out.println("Age is valid.");
			else
				System.out.println("Age in invalid.");
			break;
		case 2:
			System.out.println("Enter name: ");
			if(Main.validateName(scan.next()))
				System.out.println("Name is valid.");
			else 
				System.out.println("Name is invalid.");
			
			break;
		case 3:
			System.out.println("Enter mobile number: ");
			if(Main.validateLuckyCustomer(scan.next()))
				System.out.println("Lucky customer.");
			else
				System.out.println("Unlucky customer.");
			break;
		default:
			System.out.println("Invalid selection");
		}
		scan.close();
	}

}
