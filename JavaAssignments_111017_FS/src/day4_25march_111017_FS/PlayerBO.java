package day4_25march_111017_FS;

public class PlayerBO {
	
	public void viewDetails(Player[] playerList) {
		for(int i = 0; i < playerList.length; i++) {
			System.out.println(String.format("%-15s %-15s %-15s", "Player", "Country", "Skill"));
			System.out.println(playerList[i].toString());
		}
	}
	
	public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {
		boolean hasSkill = false;
		for(int i = 0; i < playerList.length; i++) {
			if(playerList[i].getSkill().getSkillName().equals(skill)) {
				hasSkill = true;
				System.out.println(String.format("%-15s %-15s %-15s", "Player", "Country", "Skill"));
				System.out.println(playerList[i].toString());
			}
		}
		
		if(!hasSkill) {
			System.out.println("Skill not found!");
		}
	}
	
	public Player createPlayer(String data) {
		String[] playerInfo = data.split(",");
		String playerName = playerInfo[0];
		String playerCountry = playerInfo[1];
		String playerSkill = playerInfo[2];
		
		Player p = new Player(playerName, playerCountry, new Skill(playerSkill));
		return p;
	}
}