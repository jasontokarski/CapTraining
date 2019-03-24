package day3_22march_111017_FS;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		int result = UserMainCode.validatePassword(password);
		if(result == 1) {
			System.out.println("Valid password.");
		} else {
			System.out.println("Invalid password.");
		}
	}

}
