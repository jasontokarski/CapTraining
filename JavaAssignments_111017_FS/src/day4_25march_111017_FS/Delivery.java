package day4_25march_111017_FS;

public class Delivery {
	Long deliveryNumber;
	String batsman;
	String bowler;
	Long runs;
	Long inningsNumber;
	Innings innings;
	
	public Delivery() {
		super();
	}
	
	public Long getDeliveryNumber() {
		return deliveryNumber;
	}

	public void setDeliveryNumber(Long deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	public Long getInningsNumber() {
		return inningsNumber;
	}

	public void setInningsNumber(Long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}

	public Innings getInnings() {
		return innings;
	}

	public void setInnings(Innings innings) {
		this.innings = innings;
	}

	public Delivery(Long deliveryNumber, String batsman, String bowler, Long runs, Long inningsNumber,
			Innings innings) {
		super();
		this.deliveryNumber = deliveryNumber;
		this.batsman = batsman;
		this.bowler = bowler;
		this.runs = runs;
		this.inningsNumber = inningsNumber;
		this.innings = innings;
	}
	
	
}
