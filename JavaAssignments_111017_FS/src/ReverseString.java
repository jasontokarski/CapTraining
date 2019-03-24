import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to be reversed: ");
		String reverseMe = scan.next();
		
		char[] charArr = reverseMe.toCharArray();
		int j = 0;
		
		for(int i = reverseMe.length()-1; i >= 0; i--) {
			charArr[j] = reverseMe.charAt(i);
			j++;			
		}
		
		for(char ch : charArr) {
			System.out.print(ch);
		}
	}

}
