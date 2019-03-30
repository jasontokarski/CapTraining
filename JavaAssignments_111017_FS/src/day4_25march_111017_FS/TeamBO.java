package day4_25march_111017_FS;

public class TeamBO {
	public Team createTeam(String data, Player[] playerList) {
		String[] teamInfo = data.split(",");
		String teamName = teamInfo[0];
		String teamPlayer = teamInfo[1];
		Team t = new Team();
		boolean found = false;
		
		//Search through the playerlist to see if this player exists
		for(Player p : playerList) {
			if(teamPlayer.equals(p.getName())) {
				t.setName(teamName);
				t.setPlayer(p);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("Player not found!");
		}
		
		return t;
	}
}
