package day3_22march_111017_FS;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String prevReading = scan.next();
		String curReading = scan.next();
		int unitPerCharge = scan.nextInt();
		
		prevReading = prevReading.replaceAll("[^0-9.]", "");
		curReading = curReading.replaceAll("[^0-9.]", "");
		
		int result = UserMainCode.calculateElectricityBill(Integer.parseInt(prevReading), Integer.parseInt(curReading), unitPerCharge);
		System.out.println(result);
	}

}
