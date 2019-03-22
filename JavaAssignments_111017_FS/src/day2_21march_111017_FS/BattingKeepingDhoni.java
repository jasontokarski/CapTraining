package day2_21march_111017_FS;
import java.util.Scanner;

public class BattingKeepingDhoni {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String coachIsAvailable = "";
		coachIsAvailable = scan.next();
		
		if(coachIsAvailable.toLowerCase().equals("yes")) {
			System.out.println("Keeping");
		} 
		else if(coachIsAvailable.toLowerCase().equals("no")) {
			System.out.println("Batting");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
