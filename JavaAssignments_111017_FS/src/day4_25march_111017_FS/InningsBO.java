package day4_25march_111017_FS;

public class InningsBO {
	public InningsBO() {
		super();
	}
	
	public Innings createInnings(String data) {
		String[] inningData = data.split(",");
		Long inningNo = Long.parseLong(inningData[0]);
		Innings i = new Innings(inningNo,inningData[1]);
		return i;
	}
}
