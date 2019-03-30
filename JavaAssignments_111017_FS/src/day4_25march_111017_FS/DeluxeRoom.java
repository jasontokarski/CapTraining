package day4_25march_111017_FS;

public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public DeluxeRoom() {
		super();
	}
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public int getRatePerSqFeet() {
		if(this.hasWifi) {
			return this.ratePerSqFeet + 2;
		}
		return this.ratePerSqFeet;
	}
	
}
