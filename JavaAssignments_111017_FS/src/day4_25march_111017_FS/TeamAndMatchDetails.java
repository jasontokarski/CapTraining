package day4_25march_111017_FS;

import java.util.Scanner;

public class TeamAndMatchDetails {

	public static void main(String[] args) {
		System.out.print("Enter the player count: ");
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		int numPlayers = scan.nextInt();
		boolean displayMenu = true;
		Player[] pArr = new Player[numPlayers];
		
		for(int i = 0; i < numPlayers; i++) {
			System.out.println("Enter player " + (i+1) + " details:");
			PlayerBO pbo = new PlayerBO();
			String playerInfo = scan.next();
			Player p = pbo.createPlayer(playerInfo);
			pArr[i] = p;
		}

		System.out.print("Enter the team count: ");
		int numTeams = scan.nextInt();
		Team[] tArr = new Team[numTeams];
		
		for(int i = 0; i < numTeams; i++) {
			System.out.println("Enter team " + (i+1) + " details:");
			TeamBO tbo = new TeamBO();
			String teamInfo = scan.next();
			Team t = tbo.createTeam(teamInfo, pArr);
			tArr[i] = t;
		}
		
		System.out.print("Enter the match count: ");
		int numMatches = scan.nextInt();
		Match[] mArr = new Match[numMatches];
		MatchBO mbo = new MatchBO();
		
		for(int i = 0; i < numMatches; i++) {
			System.out.println("Enter match " + (i+1) + " details:");
			String matchInfo = scan.next();
			Match m = mbo.createMatch(matchInfo, tArr);
			mArr[i] = m;
		}
		
		do {
			System.out.println("Menu: ");
			System.out.println("1) Find Team ");
			System.out.println("2) Find All Matches in a Specific Venue ");
			System.out.println("Type 1 or 2 ");
			System.out.println("Enter your choice ");
			
			switch(scan.nextInt()) {
			case 1:
				System.out.println("Enter Match Date ");
				String matchDate = scan.next();
				System.out.println("Team");
				System.out.println(mbo.findTeam(matchDate,mArr));
				break;
			case 2:
				System.out.println("Enter Team Name");
				String teamName = scan.next();
				mbo.findAllMatchesOfTeam(teamName, mArr);
				break;
			case 3:
				displayMenu = false;
				scan.close();
				break;
			default: 
				System.out.println("Invalid option!");
			}
			
			System.out.println("Do you want to continue? Type Yes or No.");
			String cont = scan.next();
			if(cont.equalsIgnoreCase("no"))
				displayMenu = false;
		} while(displayMenu);
	}

}
