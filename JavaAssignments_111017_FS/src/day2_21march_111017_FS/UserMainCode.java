package day2_21march_111017_FS;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int num) {
		int sumOfSquare = 0;
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
			if((Character.digit(number.charAt(i), 10) % 2) == 0) {
				int charToInt = Character.digit(number.charAt(i), 10);
				sumOfSquare = sumOfSquare + (charToInt * charToInt);
			}
		}
		return sumOfSquare;
	}
	
	public static int countSeven(int num) {
		String number = String.valueOf(num);
		int counter = 0;
		for(int i = 0; i < number.length(); i++) {
			if((Character.digit(number.charAt(i), 10) == 7)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean compareLastDigit(int num1, int num2) {
		if((num1 % 10) == (num2 % 10)) {
			return true;
		} else {
			return false;
		}
	}
}
