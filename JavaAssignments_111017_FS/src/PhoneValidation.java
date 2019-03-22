import java.util.Scanner;

public class PhoneValidation {

	public static boolean isValid(String s) {
		if(s.length() != 10) {
			return false;
		}
		
		char firstNum = s.charAt(0);
		switch(firstNum) {
		case '7':
			break;
		case '8':
			break;
		case '9':
			break;
		default:
			return false;
		}
		
		if(!s.matches("^[0-9]*$")) {
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a phone number: ");
		String phoneNumber = scan.next();
		if(isValid(phoneNumber)) {
			System.out.println("This phone number is valid!");
		} else {
			System.out.println("Phone number must be digits and begin with 7,8, or 9");
		}
	}

}
