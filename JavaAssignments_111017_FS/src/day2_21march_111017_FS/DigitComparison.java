package day2_21march_111017_FS;

import java.util.Scanner;

public class DigitComparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(UserMainCode.compareLastDigit(num1, num2)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
