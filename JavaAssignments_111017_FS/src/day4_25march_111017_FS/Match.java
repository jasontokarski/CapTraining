package day4_25march_111017_FS;

public class Match {
	private String date;
	private Team teamone;
	private Team teamtwo;
	private String venue;
	
	private String teamOne;
	private String teamTwo;
	private Outcome outcome;
	
	public Match() {
		super();
	}
	
	public Match(String date, Team teamone, Team teamtwo, String venue, Team team) {
		super();
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
	}
	
	public Match(String date, String teamOne, String teamTwo, String venue, Outcome outcome) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.outcome = outcome;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Team getTeamone() {
		return teamone;
	}

	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}

	public Team getTeamtwo() {
		return teamtwo;
	}

	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}
	
	public String getTeamOne() {
		return teamOne;
	}
	
	public String getTeamTwo() {
		return teamTwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public Outcome getOutcome() {
		return outcome;
	}
	
	public String toString() {
		return String.format("%-15s %-15s %-15s %s", date, teamone.getName(), teamtwo.getName(), venue);
	}
}
