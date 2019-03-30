package day4_25march_111017_FS;

public class Innings {
	private Long inningsNumber;
	private String battingTeam;
	
	public Innings() {
		super();
	}
	
	public Innings(Long inningsNumber, String battingTeam) {
		this.inningsNumber = inningsNumber;
		this.battingTeam = battingTeam;
	}
	
	public Long getInningsNumber() {
		return inningsNumber;
	}
	
	public String getBattingTeam() {
		return battingTeam;
	}
	
	public void setInningsNumber(Long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}
	
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	
}
