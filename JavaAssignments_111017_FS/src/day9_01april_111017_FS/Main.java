package day9_01april_111017_FS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		System.out.println("Enter the number of players");
		int numberOfPlayers = scan.nextInt();
		List<Player> playerList = new ArrayList<Player>();
		PlayerBO pbo = new PlayerBO();
		
		Player p;
		Player c = null;
		
		System.out.println("Do you know the details of captain? Type Yes/No");
		if(scan.next().equals("Yes")) {
			c = new Player();
			System.out.println("Enter name of the captain");
			c.setName(scan.next());
			System.out.println("Enter country of the captain");
			c.setCountry(scan.next());
			System.out.println("Enter skillset of the captain");
			c.setSkill(scan.next());
		} 
			
		for(int i = 0; i < numberOfPlayers;i++) {
			p = new Player();
			System.out.println("Enter name of player " + (i+1));
			p.setName(scan.next());
			System.out.println("Enter country of player " + (i+1));
			p.setCountry(scan.next());
			System.out.println("Enter skillset of player " + (i+1));
			p.setSkill(scan.next());
			playerList.add(p);
		}
		pbo.displayPlayerDetails(c, playerList);
		scan.close();
	}

}
