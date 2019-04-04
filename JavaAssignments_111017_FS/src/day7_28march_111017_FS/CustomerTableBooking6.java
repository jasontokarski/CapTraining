package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CustomerTableBooking6 {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner scan = new Scanner(System.in);
		List<Booking> bookingList = new ArrayList<Booking>();
		Map<Date,Double> dayBilling = new TreeMap<Date,Double>();
		System.out.println("Enter the number of booking details:");
		int numberOfBookings = scan.nextInt();
		
		for(int i = 0; i < numberOfBookings; i++) {
			String[] bookingData = scan.next().split(",");
			bookingList.add(new Booking(Long.parseLong(bookingData[0]), bookingData[1], Integer.parseInt(bookingData[2]), Integer.parseInt(bookingData[3]), Double.parseDouble(bookingData[4]), new SimpleDateFormat("dd-MM-yyyy").parse(bookingData[5])));
		}
		
		dayBilling = Booking.calculateDayBilling(bookingList);
		System.out.format("%-20s %s\n","Date","Amount");
		
		for(Map.Entry<Date,Double> entry : dayBilling.entrySet()) {
			  Date key = entry.getKey();
			  Double value = entry.getValue();
			  System.out.format("%-20s %s\n",new SimpleDateFormat("dd-MM-yyyy").format(key),value);
		}
		scan.close();
	}
}
