package day9_01april_111017_FS;

import java.util.List;

public class PlayerBO {
	public void displayPlayerDetails(Player captain, List<Player> playerList) {
		try {
			System.out.println(captain.toString());
			
		} catch(NullPointerException e) {
			System.out.println("Exception Occured : " + e);
			System.out.println("Captain details not available");
		}finally {
			System.out.println("Player Details");
			for(Player player : playerList) {
				System.out.println(player);
			}
		}
	}
}
