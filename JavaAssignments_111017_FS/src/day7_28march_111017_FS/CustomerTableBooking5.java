package day7_28march_111017_FS;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerTableBooking5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Table t = new Table();
		boolean promptUser = true;
		List<Table> tableList = new ArrayList<Table>();
		List<Booking> bookingList = new ArrayList<Booking>();
		
		System.out.println("Enter the number of tables:");
		int numberOfTables = scan.nextInt();
		for(int i = 0; i < numberOfTables;i++) {
			t = Table.createTable(scan.next());
			tableList.add(t);
		}

		do {
			System.out.println("Enter the booking details:");
			String bookingDetails = scan.next();
			try {
				Booking.createBooking(tableList, bookingList, bookingDetails);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Do you want to continue(yes/no)");
			if(scan.next().equalsIgnoreCase("no")) {
				promptUser = false;
			}
		} while(promptUser);
		scan.close();
	}
}
