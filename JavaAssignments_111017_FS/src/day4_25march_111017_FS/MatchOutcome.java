package day4_25march_111017_FS;

import java.util.Scanner;

public class MatchOutcome {
	public static void main(String[] args) {
		System.out.println("Enter the number of matches");
		Scanner scan = new Scanner(System.in);
		int numMatches = scan.nextInt();
		Match[] mArr = new Match[numMatches];
		MatchBO mbo = new MatchBO();
		String outcome = null;
		boolean displayMenu = true;
		
		for(int i = 0; i < numMatches; i++) {
			System.out.println("Enter match " + (i+1) + " details");
			System.out.println("Enter match date");
			String matchDate = scan.next();
			System.out.println("Enter team one");
			String teamOne = scan.next();
			System.out.println("Enter team two");
			String teamTwo = scan.next();
			System.out.println("Enter venue");
			String venue = scan.next();
			System.out.println("Enter status");
			String status = scan.next();
			System.out.println("Enter winner Team");
			String winnerTeam = scan.next();
			Outcome o = new Outcome(status, winnerTeam);
			Match m = new Match(matchDate, teamOne, teamTwo, venue, o);
			mArr[i] = m;
		}
		
		while(displayMenu) {
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				mbo.printAllMatchDetails(mArr);
				break;
			case 2:
				System.out.println("Enter outcome status");
				outcome = scan.next();
				mbo.printMatchDetailsWithOutcomeStatus(mArr, outcome);
				break;
			case 3:
				System.out.println("Enter outcome winner team");
				outcome = scan.next();
				mbo.printMatchDetailsWithOutcomeWinnerTeam(mArr, outcome);
				break;
			case 4:
				displayMenu = false;
				break;
			default: 
				System.out.println("Invalid option!");
			}
		}
		scan.close();
	}

}
