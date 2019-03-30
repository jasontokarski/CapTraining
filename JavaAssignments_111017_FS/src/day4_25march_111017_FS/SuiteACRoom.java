package day4_25march_111017_FS;

public class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;
	
	public SuiteACRoom() {
		this.ratePerSqFeet = 15;
	}
	
	
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}


	public void HotelRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet + 2;
		}
		return ratePerSqFeet;
	}
}
