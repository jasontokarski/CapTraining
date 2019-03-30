package day4_25march_111017_FS;

import java.util.Scanner;

public class HotelRoomAndCost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean displayMenu = true;
		Boolean hasTV = false;
		Boolean hasWifi = false;
		
		while(displayMenu) {
			System.out.println("Hotel Tariff Calculator\n");
			System.out.println("1. Deluxe Room");
			System.out.println("2. Deluxe AC Room");
			System.out.println("3. Suite AC Room");
			
			int choice = scan.nextInt();
			
			System.out.println("Hotel Name:");
			String hotelName = scan.next();
			System.out.println("Room Square Feet Area:");
			int roomSqFeet = scan.nextInt();
			System.out.println("Room has TV (yes/no):");
			hasTV = scan.next().equalsIgnoreCase("yes") ? true : false;
			System.out.println("Room has Wifi (yes/no):");
			hasWifi = scan.next().equalsIgnoreCase("yes") ? true : false;
			
			switch(choice) {
			case 1:
				DeluxeRoom dr = new DeluxeRoom(hotelName, roomSqFeet, hasTV, hasWifi);
				System.out.println(dr.calculateTariff());
				break;
			case 2:
				DeluxeACRoom dacr = new DeluxeACRoom(hotelName, roomSqFeet, hasTV, hasWifi);
				System.out.println(dacr.calculateTariff());
				break;
			case 3:
				SuiteACRoom sacr = new SuiteACRoom(hotelName, roomSqFeet, hasTV, hasWifi);
				System.out.println(sacr.calculateTariff());
				break;
			default:
			}
		}
		scan.close();
	}
}
