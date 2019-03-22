package day2_21march_111017_FS;

import java.util.Scanner;

public class DhonisBattingPosition {

	public static final int numberOfBall = 6;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of overs: ");
		double over = scan.nextDouble() * numberOfBall;
		System.out.println("Enter number of balls played: ");
		double ballsPlayed = scan.nextDouble();
		System.out.println("Enter total overs in the innings: ");
		double totalOver = scan.nextDouble() * numberOfBall;
		double result = ((over + 3.0) / totalOver);
		if((result * 100) > 75) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
