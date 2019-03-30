package day4_25march_111017_FS;

public class Outcome {
	String status;
	String winnerTeam;
	
	public Outcome(String status, String winnerTeam) {
		super();
		this.status = status;
		this.winnerTeam = winnerTeam;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getWinnerTeam() {
		return winnerTeam;
	}
	
	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}
	
	public String toString() {
		return String.format("%-15s %-15s", status, winnerTeam);
	}
}
