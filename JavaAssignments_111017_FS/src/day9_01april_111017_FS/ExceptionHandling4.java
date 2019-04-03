package day9_01april_111017_FS;

import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) throws DuplicateIdException {
		String teamName;
		int numberOfPlayers;
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		System.out.println("Enter the team name");
		teamName = scan.next();
		System.out.println("Enter the number of players suggested");
		numberOfPlayers = scan.nextInt();
		int[] playerId = new int[numberOfPlayers];
		String[] playerName = new String[numberOfPlayers];
		for(int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Enter player " + (i+1) + " details");
			int pid = scan.nextInt();
			playerName[i] = scan.next();
				for(int j : playerId) {
					if(pid == j) {
						throw new DuplicateIdException("Player Id must be unique");
					}
				}
			playerId[i] = pid;
		}
		
		for(int i = 0; i < numberOfPlayers; i++) {
			System.out.print(playerId[i] + " " + playerName[i] + "\n");
		}
		scan.close();
	}

}