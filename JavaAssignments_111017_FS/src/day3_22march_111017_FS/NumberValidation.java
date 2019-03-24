package day3_22march_111017_FS;

import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phoneNumber = scan.next();
		int result = UserMainCode.validateNumber(phoneNumber);
		if(result == 1) {
			System.out.println("Valid number format.");
		} else {
			System.out.println("Invalid number format.");
		}
	}

}
