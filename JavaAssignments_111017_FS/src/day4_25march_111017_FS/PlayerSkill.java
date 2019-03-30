package day4_25march_111017_FS;

import java.util.Scanner;


public class PlayerSkill {
	public static void main(String[] args) {
		System.out.print("Enter the number of players: ");
		Scanner scan = new Scanner(System.in);
		int numPlayers = scan.nextInt();
		boolean displayMenu = true;
		Player[] pArr = new Player[numPlayers];
		
		for(int i = 0; i < numPlayers; i++) {
			System.out.println("Enter player " + i+1 + " details:");
			System.out.println("Enter player name: ");
			String name = scan.next();
			System.out.println("Enter country name: ");
			String country = scan.next();
			System.out.println("Enter skill: ");
			String skill = scan.next();
			Player p = new Player(name, country, new Skill(skill));
			pArr[i] = p;
		}
		
		PlayerBO pbo = new PlayerBO();
		
		while(displayMenu) {
			System.out.println("Menu: ");
			System.out.println("1.View Details ");
			System.out.println("2.Filter players with skill ");
			System.out.println("3.Exit ");
			
			switch(scan.nextInt()) {
			case 1: 
				pbo.viewDetails(pArr);
				break;
			case 2:
				System.out.println("Enter Skill");
				pbo.printPlayerDetailsWithSkill(pArr, scan.next());
				break;
			case 3:
				displayMenu = false;
				break;
			default: 
				System.out.println("Invalid option!");
			}
		}
		scan.close();
	}
}