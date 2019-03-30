package day4_25march_111017_FS;

public class MatchBO {
	public Match createMatch(String data, Team[] teamList) {
		String[] matchInfo = data.split(",");
		String date = matchInfo[0];
		String teamOne = matchInfo[1].replaceAll("\\s+","");
		String teamTwo = matchInfo[2].replaceAll("\\s+","");;
		String venue = matchInfo[3];
		boolean found = false;
		
		Match m = new Match();
		
		for(Team t : teamList) {
			if(teamOne.equals(t.getName())) {
				m.setTeamone(t);
				m.setDate(date);
				m.setVenue(venue);
				found = true;
			} 
			
			if(teamTwo.equals(t.getName())) {
				m.setTeamtwo(t);
				m.setDate(date);
				m.setVenue(venue);
				found = true;
			} 
			
			if(!found) {
				System.out.println("Team not found!");
			}
			found = false;
		}
		
		return m;
	}
	
	public String findTeam(String matchDate, Match[] matchList) {
		for(Match m : matchList) {
			if(matchDate.equals(m.getDate())) {
				return m.getTeamone().getName() + ", " + m.getTeamtwo().getName();
			} 
		}
		return "Date not found!";
	}
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		System.out.println(String.format("%-15s %-15s %-15s %-15s", "Date", "TeamOne", "TeamTwo", "Venue"));
		for(Match m: matchList) {
			if(teamName.equals(m.getTeamone().getName()) || teamName.equals(m.getTeamtwo().getName())){
				System.out.println(m.toString());
			}
		}
	}
	
	void printAllMatchDetails(Match[] MatchList) {
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "Team1", "Team2", "Venue", "Status", "Winner"));
		for(Match m : MatchList) {
			System.out.println(String.format("%-15s %-15s %-15s %-15s %-30s", m.getDate(), m.getTeamOne(), m.getTeamTwo(), m.getVenue(), m.getOutcome().toString()));
		}
	}
	
	void printMatchDetailsWithOutcomeStatus(Match[] MatchList, String outcomeStatus) {
		boolean displayHeader = true;
		boolean found = false;
		for(Match m : MatchList) {
			if(outcomeStatus.equals(m.getOutcome().getStatus())) {
				found = true;
				if(displayHeader) {
					System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "Team1", "Team2", "Venue", "Status", "Winner"));
					displayHeader = false;
				}
				System.out.println(String.format("%-15s %-15s %-15s %-15s %-30s", m.getDate(), m.getTeamOne(), m.getTeamTwo(), m.getVenue(), m.getOutcome().toString()));
			}
		}
		
		if(!found) {
			System.out.println("Status not found!");
		}
	}
	
	void printMatchDetailsWithOutcomeWinnerTeam(Match[] MatchList, String outcomeWinnerTeam) {
		boolean displayHeader = true;
		boolean found = false;
		for(Match m : MatchList) {
			if(outcomeWinnerTeam.equals(m.getOutcome().getWinnerTeam())) {
				found = true;
				if(displayHeader) {
					System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "Team1", "Team2", "Venue", "Status", "Winner"));
					displayHeader = false;
				}
				System.out.println(String.format("%-15s %-15s %-15s %-15s %-30s", m.getDate(), m.getTeamOne(), m.getTeamTwo(), m.getVenue(), m.getOutcome().toString()));
			}
		}
		
		if(!found) {
			System.out.println("Winner team not found!");
		}
	}
}
