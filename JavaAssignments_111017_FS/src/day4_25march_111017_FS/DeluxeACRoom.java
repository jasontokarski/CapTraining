package day4_25march_111017_FS;

public class DeluxeACRoom extends DeluxeRoom {
	public DeluxeACRoom() {
		ratePerSqFeet = 12;
	}
	
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 12;
	}
}
